package com.altmann.choresmanager.models.chores.college

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlin.math.floor

class CollegeChore(
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
    finishedDate: LocalDate,
    deleted: Boolean? = false,
    finished: Boolean? = false,
    color: Color? = Color.Blue,

    val subject: String,
    val location: String?,
    val professor: String?,
    val totalHours: Int?,
    var failed: Boolean = false,
    var absencesAllowed: Int = 0,
    var absencesCurrent: Int = 0
) : Chore(
    choreId, startTime, endTime, daysOfWeek,
    startDate, endDate, choreException, title, description,
    priority, finishedDate, deleted, finished, color
) {

    init {
        calculateAbsencesAllowed()
    }

    fun getAbsencePercentage(): Float? {
        if (absencesAllowed == 0) return null
        return (absencesCurrent.toFloat()) / absencesAllowed.toFloat()
    }

    fun addAbsence() {
        absencesCurrent = (absencesCurrent) + 1
        if (absencesCurrent > absencesAllowed / 1.5) {
            priority = Priority.HIGH
        }
        if (absencesCurrent > absencesAllowed) {
            failed = true
        }
    }

    fun removeAbsence() {
        absencesCurrent = (absencesCurrent) - 1
        if (absencesCurrent <= absencesAllowed / 1.5) {
            priority = Priority.NORMAL
        }
        if (absencesCurrent < 0) absencesCurrent = 0
    }

    private fun calculateAbsencesAllowed() {
        if (totalHours == null) return
        absencesAllowed = floor((totalHours * 0.25) / duration()).toInt()
    }
}