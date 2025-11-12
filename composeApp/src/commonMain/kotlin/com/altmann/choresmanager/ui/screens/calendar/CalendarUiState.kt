package com.altmann.choresmanager.ui.screens.calendar

import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.datetime.LocalDate

data class CalendarUiState(
    val anchor: LocalDate = LocalDate(1970,1,1),
    val selectedDate : LocalDate = CalendarHelper.today(),
    val expanded : Boolean = false,
    val choresByDate : Map<LocalDate, List<Chore>> = emptyMap(),
    val enabledChores : List<Chore> = emptyList()
)
