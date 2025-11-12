package com.altmann.choresmanager.ui.screens.calendar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altmann.choresmanager.utils.CalendarHelper
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.datetime.LocalDate

class CalendarViewModel(private val choreVM : SharedChoreViewModel) : ViewModel() {
    private val _selectedDate = MutableStateFlow(CalendarHelper.today())
    val selectedDate: StateFlow<LocalDate> = _selectedDate

    private val _expandedDay = MutableStateFlow(false)
    val expandedDay: StateFlow<Boolean> = _expandedDay

    val anchor: StateFlow<LocalDate> = choreVM.anchor
    val mappedChores = choreVM.mappedChores
    val enabledChores = choreVM.enabledChores

    // Reactive UI state derived from flows; UI collects this
    val state: StateFlow<CalendarUiState> =
        combine(anchor, selectedDate, expandedDay, mappedChores, enabledChores) { a, sd, ex, map, en ->
            CalendarUiState(
                anchor = a,
                selectedDate = sd,
                expanded = ex,
                choresByDate = map,
                enabledChores = en,
            )
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = CalendarUiState(
                anchor = choreVM.anchor.value,
                selectedDate = _selectedDate.value,
                expanded = _expandedDay.value,
                choresByDate = choreVM.mappedChores.value,
                enabledChores = choreVM.enabledChores.value,
            )
        )

    init {
        // Kick off any initial mapping
        onEvent(CalendarEvent.LoadChores)
    }

    fun onEvent(event: CalendarEvent) {
        when (event) {
            is CalendarEvent.SelectDate -> onSelectDate(event.date)
            is CalendarEvent.AddChore -> choreVM.addChore(event.chore)
            is CalendarEvent.DismissExpanded -> dismissExpandedDay()
            is CalendarEvent.NextMonth -> choreVM.onNext()
            is CalendarEvent.PrevMonth -> choreVM.onPrev()
            is CalendarEvent.LoadChores -> choreVM.remapChores()
            is CalendarEvent.MarkFinished -> choreVM.markChoreFinished(event.choreId, event.date)
        }
    }

    fun onSelectDate(date: LocalDate) = viewModelScope.launch {
        if (_selectedDate.value != date) {
            _selectedDate.value = date
            _expandedDay.value = false
        } else {
            _expandedDay.value = !_expandedDay.value
        }
    }

    fun dismissExpandedDay() {
        _expandedDay.value = false
    }
}