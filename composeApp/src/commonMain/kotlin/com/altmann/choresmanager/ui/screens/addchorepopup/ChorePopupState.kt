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
    val selectedChoreType: String = "Default",
    val selectedPriority: String = "Normal",
    val selectedColor: Color = Color.Blue,
    val isColorPickerOpen: Boolean = false,

    // Other chore types fields
    // College
    val subject : String = "",
    val location : String = "",
    val professor : String = "",
    val totalHours : String = "",

    // Gym
    val workout: List<Exercise> = listOf(),
    val exerciseDay: String = "",

    // Grocery
    val items : List<Item> = emptyList()
)