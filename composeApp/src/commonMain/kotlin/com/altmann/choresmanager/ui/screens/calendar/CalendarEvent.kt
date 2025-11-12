package com.altmann.choresmanager.ui.screens.calendar

import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.LocalDate

sealed interface CalendarEvent {
    data class SelectDate(val date: LocalDate) : CalendarEvent
    object DismissExpanded : CalendarEvent
    data class AddChore(val chore: Chore) : CalendarEvent
    data class MarkFinished(val choreId : Int, val date : LocalDate) : CalendarEvent
    object LoadChores : CalendarEvent
    object PrevMonth : CalendarEvent
    object NextMonth : CalendarEvent
}