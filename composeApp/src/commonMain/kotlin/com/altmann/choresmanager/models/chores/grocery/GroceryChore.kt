package com.altmann.choresmanager.models.chores.grocery

import com.altmann.choresmanager.models.chores.Chore

class GroceryChore(
    chore : Chore,

    val items : List<Item> = emptyList()
) : Chore(
    chore.choreId, chore.startTime, chore.endTime, chore.daysOfWeek,
    chore.startDate, chore.endDate, chore.choreException, chore.title, chore.description,
    chore.priority, chore.deleted, chore.finished, chore.color
)