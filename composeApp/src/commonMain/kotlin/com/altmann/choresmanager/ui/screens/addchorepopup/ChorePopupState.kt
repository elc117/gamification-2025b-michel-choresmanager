package com.altmann.choresmanager.ui.screens.addchorepopup

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.chores.grocery.Item
import com.altmann.choresmanager.models.chores.gym.Exercise
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

data class ChorePopupState(
    val isOpen: Boolean = false,
    val title: String = "",
    val description: String = "",
    val selectedDays: List<DayOfWeek> = emptyList(),
    val startTime: LocalTime = LocalTime(12, 0),
    val endTime: LocalTime = LocalTime(13, 0),
    val startDate: LocalDate = LocalDate(1970, 1, 1),
    val endDate: LocalDate = LocalDate(1970, 1, 1),
    val choreExceptionDates: List<LocalDate> = emptyList(),
    val selectedChoreType: String = "Default",
    val selectedPriority: String = "Normal",
    val selectedColor: Color = Color.Blue,
    val isColorPickerOpen: Boolean = false,

    // Other chore types fields
    // College
    val totalHoursTxt : String = "",

    val subject : String = "",
    val location : String = "",
    val professor : String = "",
    val totalHours : Int? = null,

    // Gym
    val workout: List<Exercise> = listOf(),
    val exerciseDay: String = "",

    // Grocery
    val items : List<Item> = emptyList()
)