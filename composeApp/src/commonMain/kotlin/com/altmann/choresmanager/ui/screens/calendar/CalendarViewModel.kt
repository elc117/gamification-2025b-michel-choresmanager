package com.altmann.choresmanager.ui.screens.calendar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altmann.choresmanager.network.model.UserRequest
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.repository.UserRepository
import com.altmann.choresmanager.utils.CalendarHelper
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.minus
import kotlinx.datetime.plus

class CalendarViewModel(private val choreVM : SharedChoreViewModel) : ViewModel() {
    private val _selectedDate = MutableStateFlow(CalendarHelper.today())
    val selectedDate: StateFlow<LocalDate> = _selectedDate

    private val _expandedAddChore = MutableStateFlow(false)
    val expandedAddChore: StateFlow<Boolean> = _expandedAddChore

    private val _weekAnchor = MutableStateFlow(
        CalendarHelper.previousOrSameSunday(CalendarHelper.today())
    )
    val weekAnchor: StateFlow<LocalDate> = _weekAnchor

    val anchor: StateFlow<LocalDate> = choreVM.anchor
    val mappedChores = choreVM.mappedChores
    val enabledChores = choreVM.enabledChores

    var text = MutableStateFlow("")

    val user = UserRequest(
        name = "Vinicius",
        email = "vine@gmail.com",
        password = "12345"
    )
    fun testApi() = viewModelScope.launch {
        val result = UserRepository().authenticateUser(user.email, user.password)
        when (result) {
            is ApiResult.Success -> text.value = "Success! ${result.data.toString()}"
            is ApiResult.Error -> text.value = "Error: ${result.message}"
        }
    }

    // Reactive UI state derived from flows; UI collects this
    val state: StateFlow<CalendarUiState> =
        combine(
            anchor,
            selectedDate,
            expandedAddChore,
            mappedChores,
            enabledChores
        ) { a, sd, ex, map, en ->
            CalendarUiState(
                anchor = a,
                selectedDate = sd,
                expandedAddChore = ex,
                choresByDate = map,
                enabledChores = en,
            )
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.Companion.WhileSubscribed(5_000),
            initialValue = CalendarUiState(
                anchor = choreVM.anchor.value,
                selectedDate = _selectedDate.value,
                expandedAddChore = _expandedAddChore.value,
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
            is CalendarEvent.UpdateChore -> choreVM.updateChore(event.chore)
            is CalendarEvent.DismissExpanded -> dismissExpandedDay()
            is CalendarEvent.NextMonth -> choreVM.onNext()
            is CalendarEvent.PrevMonth -> choreVM.onPrev()
            is CalendarEvent.NextWeek -> onNextWeek()
            is CalendarEvent.PrevWeek -> onPrevWeek()
            is CalendarEvent.LoadChores -> choreVM.remapChores()
            is CalendarEvent.MarkFinished -> choreVM.markChoreFinished(event.choreId, event.date)
        }
    }

    fun onNextWeek() = viewModelScope.launch {
        _weekAnchor.value = _weekAnchor.value.plus(DatePeriod(days = 7))
    }

    fun onPrevWeek() = viewModelScope.launch {
        _weekAnchor.value = _weekAnchor.value.minus(DatePeriod(days = 7))
    }

    fun onSelectDate(date: LocalDate) = viewModelScope.launch {
        if (_selectedDate.value != date) {
            _selectedDate.value = date
            _expandedAddChore.value = false
        } else {
            _expandedAddChore.value = !_expandedAddChore.value
        }
    }

    fun dismissExpandedDay() {
        _expandedAddChore.value = false
    }
}