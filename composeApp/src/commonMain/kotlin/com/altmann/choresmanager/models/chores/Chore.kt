package com.altmann.choresmanager.models.chores

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

open class Chore(
    val choreId: Int,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val daysOfWeek: List<DayOfWeek>,
    val startDate: LocalDate,
    val endDate: LocalDate,
    var choreException : List<LocalDate> = emptyList(),
    val title: String,
    val description: String,
    var priority: Priority,
    val deleted: Boolean? = false,
    val finished: Boolean? = false,
    val color: Color = Color.DarkGray
) {
    open fun duration() : Int{
        return endTime.compareTo(startTime)
    }
}


