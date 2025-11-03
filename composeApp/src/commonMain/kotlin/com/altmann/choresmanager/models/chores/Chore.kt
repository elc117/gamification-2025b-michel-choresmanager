package com.altmann.choresmanager.models.chores

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate

open class Chore(
    val choreId: Int,
    val startTime: DateTimePeriod,
    val endTime: DateTimePeriod,
    val daysOfWeek: List<DayOfWeek>,
    val startDate: LocalDate,
    val endDate: LocalDate,
    var choreException : List<LocalDate> = emptyList(),
    val title: String,
    val description: String,
    var priority: Priority,
    val finishedDate: LocalDate,
    val deleted: Boolean? = false,
    val userId: Int,
    val finished: Boolean? = false,
    val color: Color? = Color.DarkGray
) {
    open fun duration() : Int{
        return endTime.hours - startTime.hours
    }
}


