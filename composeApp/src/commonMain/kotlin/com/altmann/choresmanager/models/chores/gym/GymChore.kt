package com.altmann.choresmanager.models.chores.gym

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

class GymChore(
    chore: Chore,

    val workout: List<Exercise>,
    val exerciseDay: String // e.g. "Leg Day", "Arm Day"

) : Chore(
    chore.choreId, chore.startTime, chore.endTime, chore.daysOfWeek,
    chore.startDate, chore.endDate, chore.choreException, chore.title, chore.description,
    chore.priority, chore.deleted, chore.finished, chore.color
)