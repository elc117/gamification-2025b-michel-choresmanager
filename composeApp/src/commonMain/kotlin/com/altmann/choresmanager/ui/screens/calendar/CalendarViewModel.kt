package com.altmann.choresmanager.ui.screens.calendar

import androidx.lifecycle.ViewModel
import com.altmann.User
import com.altmann.choresmanager.database.UserDao
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.chores.gym.GymChore
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlinx.datetime.minus
import kotlinx.datetime.plus
import kotlin.collections.listOf

class CalendarViewModel(private val userDao: UserDao) : ViewModel() {
    private val _anchor =
        MutableStateFlow(CalendarHelper.today().let { LocalDate(it.year, it.month, 1) })
    val anchor = _anchor.asStateFlow()


    private val _mappedChores = MutableStateFlow<Map<LocalDate, List<Chore>>>(emptyMap())
    val mappedChores = _mappedChores.asStateFlow()

    private val _chores = MutableStateFlow<List<Chore>>(emptyList())
    val chores = _chores.asStateFlow()


    private val _selectedDate = MutableStateFlow(CalendarHelper.today())
    val selectedDate = _selectedDate.asStateFlow()

    private val _expandedDay = MutableStateFlow(false)
    val expandedDay = _expandedDay.asStateFlow()

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users = _users.asStateFlow()

    fun onSelectDate(date: LocalDate) {
        if (_selectedDate.value != date) {
            _selectedDate.value = date
            _expandedDay.value = false
            insertUser()
        } else {
            _expandedDay.value = !_expandedDay.value
            getUser()
            users.value.forEach { 
                print(it.username + "\n")
            }
        }
    }

    fun insertUser() {
        CoroutineScope(Dispatchers.Default).run {
            userDao.insertUser("Michel")
        }
    }

    fun getUser() {
        CoroutineScope(Dispatchers.Default).run {
            _users.value = userDao.getUsers()
        }
    }

    fun dismissExpandedDay() {
        _expandedDay.value = false
    }

    fun addChore(chore: Chore) {
        _chores.value = _chores.value.plus(chore)
        chores.value.forEach {
            print(it.endDate.toString() + "\n")
        }
        print(mappedChores.value.values.size)
    }

    fun onNext() = _anchor.update { it.plus(DatePeriod(months = 1)) }

    fun onPrev() = _anchor.update { it.minus(DatePeriod(months = 1)) }


    private fun generateChoreMap(
        anchor: LocalDate,
        chores: List<Chore>
    ): Map<LocalDate, List<Chore>>{

        val daysInMonth = when (anchor.month) {
            Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
            Month.AUGUST, Month.OCTOBER, Month.DECEMBER -> 31

            Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER -> 30
            Month.FEBRUARY -> if (anchor.year % 4 == 0 && (anchor.year % 100 != 0 || anchor.year % 400 == 0)) 29 else 28
        }

        return chores
            .flatMap { chore ->
                (1..daysInMonth).mapNotNull { day ->
                    val date = LocalDate(anchor.year, anchor.month, day)
                    if (
                        date >= chore.startDate &&
                        date <= chore.endDate &&
                        date.dayOfWeek in chore.daysOfWeek
                    ) {
                        date to chore
                    } else null
                }
            }
            .groupBy({ it.first }, { it.second })
    }

    fun loadingChores()  = CoroutineScope(Dispatchers.Default).run {
        // Chores loading test

        val previous = anchor.value.minus(DatePeriod(months = 1))
        val next = anchor.value.plus(DatePeriod(months = 1))

        val map = listOf(previous, anchor.value, next)
            // get the entries: Sequence<Entry<LocalDate, List<Chore>>>
            .flatMap { month -> generateChoreMap(month, chores.value).entries }
            // for each Entry(date, choreList), create a list of Pair(date, chore)
            .flatMap { (date, choreList) -> choreList.map { chore -> date to chore } }
            // group into Map<LocalDate, List<Chore>>
            .groupBy({ it.first }, { it.second })

        if (_mappedChores.value != map) {
            _mappedChores.update { if (map.entries == it.entries) it else map }
        }

    }

    init {
        loadingChores()
    }

}