package com.altmann.choresmanager.models.chores.gym

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

class GymChore(
    choreId: Int,
    startTime: LocalTime,
    endTime: LocalTime,
    daysOfWeek: List<DayOfWeek>,
    startDate: LocalDate,
    endDate: LocalDate,
    choreException: List<LocalDate>,
    title: String,
    description: String,
    priority: Priority,
    deleted: Boolean? = false,
    finished: Boolean? = false,
    color: Color = Color.Red,

    val workout: List<Exercise>,
    val exerciseDay : String // e.g. "Leg Day", "Arm Day"

    ) : Chore(
    choreId, startTime, endTime, daysOfWeek,
    startDate, endDate, choreException, title, description,
    priority, deleted, finished, color
)