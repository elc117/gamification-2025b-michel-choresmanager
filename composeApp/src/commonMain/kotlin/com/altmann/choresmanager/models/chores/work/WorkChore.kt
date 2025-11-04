package com.altmann.choresmanager.models.chores.work

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate

class WorkChore(
    choreId: Int,
    startTime: DateTimePeriod,
    endTime: DateTimePeriod,
    daysOfWeek: List<DayOfWeek>,
    startDate: LocalDate,
    endDate: LocalDate,
    choreException: List<LocalDate>,
    title: String,
    description: String,
    priority: Priority,
    finishedDate: LocalDate,
    deleted: Boolean? = false,
    userId: Int,
    finished: Boolean? = false,
    color: Color? = Color.Blue,

    val project: String,
    val clientName: String? = null,
    val deadline: LocalDate? = null,
) : Chore(
    choreId, startTime, endTime, daysOfWeek,
    startDate, endDate, choreException, title, description,
    priority, finishedDate, deleted, userId, finished, color
)