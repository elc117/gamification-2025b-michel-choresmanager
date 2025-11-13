package com.altmann.choresmanager.models.chores.work

import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.LocalDate

class WorkChore(
    chore : Chore,

    val project: String,
    val clientName: String? = null,
    val deadline: LocalDate? = null,
) : Chore(
    chore.choreId, chore.startTime, chore.endTime, chore.daysOfWeek,
    chore.startDate, chore.endDate, chore.choreException, chore.title, chore.description,
    chore.priority, chore.deleted, chore.finished, chore.color
)