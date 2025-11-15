package com.altmann.choresmanager.ui.screens.addchorepopup

import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.grocery.Item
import com.altmann.choresmanager.models.chores.gym.Exercise
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

sealed interface ChorePopupEvent {
    object OpenPopup : ChorePopupEvent
    object ClosePopup : ChorePopupEvent
    data class TitleChanged(val value: String) : ChorePopupEvent
    data class DescriptionChanged(val value: String) : ChorePopupEvent
    data class DayToggled(val day: DayOfWeek) : ChorePopupEvent
    data class ChoreTypeChanged(val value: String) : ChorePopupEvent
    data class PriorityChanged(val value: String) : ChorePopupEvent

    data class ColorChanged(val value: androidx.compose.ui.graphics.Color) : ChorePopupEvent
    object ToggleColorPicker : ChorePopupEvent

    // CollegeType specific
    data class SubjectChanged(val value: String) : ChorePopupEvent
    data class LocationChanged(val value: String) : ChorePopupEvent
    data class ProfessorChanged(val value: String) : ChorePopupEvent
    data class TotalHoursChanged(val value: String) : ChorePopupEvent

    // GymType specific
    data class WorkoutChanged(val workout: List<Exercise>) : ChorePopupEvent
    data class ExerciseDayChanged(val value: String) : ChorePopupEvent

    // GroceryType specific
    data class GroceryItemsChanged(val items: List<Item>) : ChorePopupEvent

    // Final action – UI will still build the Chore object and send it up to the parent
    data class AddChore(val chore: Chore) : ChorePopupEvent
}