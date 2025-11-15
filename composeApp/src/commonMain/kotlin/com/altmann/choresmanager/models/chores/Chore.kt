package com.altmann.choresmanager.models.chores

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.chores.Priority
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlin.math.abs

open class Chore(
    val choreId: String,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val daysOfWeek: List<DayOfWeek>,
    val startDate: LocalDate,
    val endDate: LocalDate,
    var choreException: List<LocalDate> = emptyList(),
    val title: String,
    val description: String,
    var priority: Priority,
    val deleted: Boolean? = false,
    var finished: Boolean = false,
    val color: Color = Color.DarkGray
) {
    open fun duration(): Int {
        return (endTime.hour * 60 + endTime.minute) - (startTime.hour * 60 + startTime.minute)
    }

    open fun finishChore() {
        finished = true
    }

    fun isException(date: LocalDate): Boolean {
        return choreException.contains(date)
    }
}


