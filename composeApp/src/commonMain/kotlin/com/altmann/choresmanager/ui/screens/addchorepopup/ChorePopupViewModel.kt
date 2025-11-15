package com.altmann.choresmanager.ui.screens.addchorepopup

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChorePopupViewModel : ViewModel() {
    private val _state = MutableStateFlow(ChorePopupState())
    val state: StateFlow<ChorePopupState> = _state.asStateFlow()

    fun onEvent(event: ChorePopupEvent) {
        when (event) {
            is ChorePopupEvent.OpenPopup -> {
                _state.value = _state.value.copy(isOpen = true)
            }
            is ChorePopupEvent.ClosePopup -> {
                _state.value = _state.value.copy(isOpen = false)
            }

            is ChorePopupEvent.TitleChanged -> {
                _state.value = _state.value.copy(title = event.value)
            }
            is ChorePopupEvent.DescriptionChanged -> {
                _state.value = _state.value.copy(description = event.value)
            }

            is ChorePopupEvent.DayToggled -> {
                val current = _state.value.selectedDays
                val updated = if (current.contains(event.day)) {
                    current - event.day
                } else {
                    current + event.day
                }
                _state.value = _state.value.copy(selectedDays = updated)
            }

            is ChorePopupEvent.ChoreTypeChanged -> {
                _state.value = _state.value.copy(selectedChoreType = event.value)
            }
            is ChorePopupEvent.PriorityChanged -> {
                _state.value = _state.value.copy(selectedPriority = event.value)
            }

            is ChorePopupEvent.ColorChanged -> {
                _state.value = _state.value.copy(selectedColor = event.value)
            }
            is ChorePopupEvent.ToggleColorPicker -> {
                _state.value = _state.value.copy(isColorPickerOpen = !_state.value.isColorPickerOpen)
            }

            // CollegeType specific
            is ChorePopupEvent.SubjectChanged -> {
                _state.value = _state.value.copy(subject = event.value)
            }
            is ChorePopupEvent.LocationChanged -> {
                _state.value = _state.value.copy(location = event.value)
            }
            is ChorePopupEvent.ProfessorChanged -> {
                _state.value = _state.value.copy(professor = event.value)
            }
            is ChorePopupEvent.TotalHoursChanged -> {
                _state.value = _state.value.copy(totalHours = event.value)
            }

            // GymType specific
            is ChorePopupEvent.WorkoutChanged -> {
                _state.value = _state.value.copy(workout = event.workout)
            }
            is ChorePopupEvent.ExerciseDayChanged -> {
                _state.value = _state.value.copy(exerciseDay = event.value)
            }

            // GroceryType specific
            is ChorePopupEvent.ItemsChanged -> {
                _state.value = _state.value.copy(items = event.items)
            }

            is ChorePopupEvent.AddChore -> {
                // No-op here; the actual add is handled by the caller using the built Chore
                // You could also reset the form here if desired
                _state.value = _state.value.copy(isOpen = false)
            }
        }
    }
}