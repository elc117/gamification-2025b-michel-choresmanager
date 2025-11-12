package com.altmann.choresmanager.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altmann.User
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.minus
import kotlinx.datetime.plus

class SharedChoreViewModel : ViewModel() {
    private val _anchor =
        MutableStateFlow(CalendarHelper.today().let { LocalDate(it.year, it.month, 1) })
    val anchor = _anchor.asStateFlow()

    private val _mappedChores = MutableStateFlow<Map<LocalDate, List<Chore>>>(emptyMap())
    val mappedChores = _mappedChores.asStateFlow()

    private val _chores = MutableStateFlow<List<Chore>>(emptyList())
    val chores = _chores.asStateFlow()

    private val _enabledChores = MutableStateFlow<List<Chore>>(emptyList())
    val enabledChores = _enabledChores.asStateFlow()

    init {
        // Auto-remap whenever anchor or enabled list changes
        viewModelScope.launch(Dispatchers.Default) {
            combine(anchor, enabledChores) { _, _ -> } // values are read inside remap
                .collect { remapChores() }
        }
    }

    fun addChore(chore: Chore) {
        _chores.value = _chores.value.plus(chore)
        _enabledChores.value = _enabledChores.value.plus(chore)
        remapChores()
    }

    fun enableDisableChore(chore: Chore) {
        _enabledChores.value =
            if (!_enabledChores.value.contains(chore)) _enabledChores.value.plus(chore)
            else _enabledChores.value.minus(chore)
        remapChores()
    }

    fun onNext() = _anchor.update { it.plus(DatePeriod(months = 1)) }

    fun onPrev() = _anchor.update { it.minus(DatePeriod(months = 1)) }

    fun markChoreFinished(choreId: Int, date : LocalDate) {
        _chores.value.find { it.choreId == choreId }?.let { chore ->
            if (date == chore.endDate) {
                chore.finishChore()
                _chores.value = _chores.value.map { if (it.choreId == choreId) chore else it }
                _enabledChores.value = _enabledChores.value.filter { it.choreId != choreId }
            } else {
                chore.choreException = chore.choreException.plus(date)
                _chores.value = _chores.value.map { if (it.choreId == choreId) chore else it }
                _enabledChores.value = _enabledChores.value.map { if (it.choreId == choreId) chore else it }
            }
        }
        // Keep enabled list; finished chores will be excluded by mapping predicate
        remapChores()
    }

    private fun generateChoreMap(
        anchor: LocalDate,
        chores: List<Chore>
    ): Map<LocalDate, List<Chore>> {

        val daysInMonth = CalendarHelper.getDaysInMonth(anchor)

        return chores
            .flatMap { chore ->
                (1..daysInMonth).mapNotNull { day ->
                    val date = LocalDate(anchor.year, anchor.month, day)
                    if (
                        date >= chore.startDate &&
                        date <= chore.endDate &&
                        date.dayOfWeek in chore.daysOfWeek &&
                        !chore.isException(date) &&
                        !chore.finished // show only unfinished chores
                    ) {
                        date to chore
                    } else null
                }
            }
            .groupBy({ it.first }, { it.second })
    }

    fun remapChores() = viewModelScope.launch(Dispatchers.Default) {
        val previous = anchor.value.minus(DatePeriod(months = 1))
        val next = anchor.value.plus(DatePeriod(months = 1))

        val map = listOf(previous, anchor.value, next)
            // get the entries: Sequence<Entry<LocalDate, List<Chore>>>
            .flatMap { month -> generateChoreMap(month, enabledChores.value).entries }
            // for each Entry(date, choreList), create a list of Pair(date, chore)
            .flatMap { (date, choreList) -> choreList.map { chore -> date to chore } }
            // group into Map<LocalDate, List<Chore>>
            .groupBy({ it.first }, { it.second })

        if (_mappedChores.value != map) {
            _mappedChores.update { if (map.entries == it.entries) it else map }
        }
    }

}