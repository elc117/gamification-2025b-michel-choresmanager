package com.altmann.choresmanager.ui.screens.calendar

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.altmann.choresmanager.DateProvider
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.chores.gym.GymChore
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlinx.datetime.minus
import kotlinx.datetime.number
import kotlinx.datetime.plus

class CalendarViewModel : ViewModel() {
    private val _anchor =
        MutableStateFlow(CalendarHelper.today().let { LocalDate(it.year, it.month, 1) })
    val anchor = _anchor.asStateFlow()

    private val _chores = MutableStateFlow<Map<LocalDate, List<Chore>>>(emptyMap())
    val chores = _chores.asStateFlow()


    private val _selectedDate = MutableStateFlow(CalendarHelper.today())
    val selectedDate = _selectedDate.asStateFlow()

    fun onSelectDate(date: LocalDate) {
        _selectedDate.value = date
    }

    fun onNext() = _anchor.update { it.plus(DatePeriod(months = 1)) }

    fun onPrev() = _anchor.update { it.minus(DatePeriod(months = 1)) }

    fun loadingChores(){
        // Chores loading test
        val chore = CollegeChore(
            choreId = 1,
            startTime = DateTimePeriod(hours = 10),
            endTime = DateTimePeriod(hours = 12),
            daysOfWeek = listOf(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY),
            startDate = LocalDate(2025, 6, 1),
            endDate = LocalDate(2025, 12, 20),
            choreException = listOf(),
            title = "Aula de Paradigmas",
            description = "Aula de paradigmas de programação",
            priority = Priority.NORMAL,
            finishedDate = LocalDate(2024, 6, 1),
            userId = 1,
            subject = "Paradigmas de programação",
            location = "Anexo A - Sala 258",
            professor = "Andrea",
            totalHours = 60
        )
        val chore1 = GymChore(
            choreId = 1,
            startTime = DateTimePeriod(hours = 10),
            endTime = DateTimePeriod(hours = 12),
            daysOfWeek = listOf(DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY),
            startDate = LocalDate(2025, 6, 1),
            endDate = LocalDate(2025, 12, 31),
            choreException = listOf(),
            title = "Treino de perna",
            description = "Treinão de perna",
            priority = Priority.NORMAL,
            finishedDate = LocalDate(2024, 6, 1),
            userId = 1,
            workout = listOf(),
            exerciseDay = "Leg Day"
        )

        val daysInMonth = when (anchor.value.month) {
            Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
            Month.AUGUST, Month.OCTOBER, Month.DECEMBER -> 31
            Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER -> 30
            Month.FEBRUARY -> if (anchor.value.year % 4 == 0 && (anchor.value.year % 100 != 0 || anchor.value.year % 400 == 0)) 29 else 28
        }

        val list = listOf(chore, chore1)
        val map =
            list.flatMap { chore ->
                // Generate dates for the current month based on the chore's schedule
                (1..daysInMonth).mapNotNull { day ->
                    val date = LocalDate(anchor.value.year, anchor.value.month, day)
                    if (date >= chore.startDate && date <= chore.endDate &&
                        chore.daysOfWeek.contains(date.dayOfWeek) &&
                        date !in chore.choreException) {
                        date to chore
                    } else null
                }

            }.groupBy({ it.first }, { it.second })
        if (_chores.value != map){
        _chores.update { if (map.entries.equals(it.entries)) it else map }
        }

        map.forEach { (date, chores) ->
            println("Date: $date")
            chores.forEach { chore ->
                println(" - Chore: ${chore.title}")
            }
        }

    }

    init {
        loadingChores()
    }

}