package com.altmann.choresmanager.models.chores.college

import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import kotlin.math.floor

class CollegeChore(
    chore: Chore,

    val subject: String,
    val location: String?,
    val professor: String?,
    val totalHours: Int?,
    var failed: Boolean = false,
    var absencesAllowed: Int = 0,
    var absencesCurrent: Int = 0
) : Chore(
    chore.choreId, chore.startTime, chore.endTime, chore.daysOfWeek,
    chore.startDate, chore.endDate, chore.choreException, chore.title, chore.description,
    chore.priority, chore.deleted, chore.finished, chore.color
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