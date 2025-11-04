package com.altmann.choresmanager.models.chores.grocery

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate

class GroceryChore(
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
    color: Color? = Color.Green,

    val items : List<Item> = emptyList()
) : Chore(
    choreId, startTime, endTime, daysOfWeek,
    startDate, endDate, choreException, title, description,
    priority, finishedDate, deleted, userId, finished, color
)