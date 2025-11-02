package com.altmann.choresmanager.ui.screens.calendar

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.altmann.choresmanager.DateProvider
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.minus
import kotlinx.datetime.plus

class CalendarViewModel : ViewModel() {
    private val _anchor =
        MutableStateFlow(CalendarHelper.today().let { LocalDate(it.year, it.month, 1) })
    val anchor = _anchor.asStateFlow()

    private val _selectedDate = MutableStateFlow(CalendarHelper.today())
    val selectedDate = _selectedDate.asStateFlow()

    fun onSelectDate(date: LocalDate) {
        _selectedDate.value = date
    }

    fun onNext() = _anchor.update { it.plus(DatePeriod(months = 1)) }

    fun onPrev() = _anchor.update { it.minus(DatePeriod(months = 1)) }

}