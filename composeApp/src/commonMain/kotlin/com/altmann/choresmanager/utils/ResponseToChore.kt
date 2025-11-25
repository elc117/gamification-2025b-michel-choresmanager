package com.altmann.choresmanager.utils

import com.altmann.choresmanager.network.model.response.ChoreResponseBase
import com.altmann.choresmanager.network.model.response.CollegeChoreResponse
import com.altmann.choresmanager.network.model.response.GroceryChoreResponse
import com.altmann.choresmanager.network.model.response.GymChoreResponse
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.chores.grocery.GroceryChore
import com.altmann.choresmanager.models.chores.gym.GymChore
import com.altmann.choresmanager.network.model.response.ChoreResponse

object ResponseToChore {
    fun toChore(choreResponse : ChoreResponseBase) : Chore {
        val baseChore = Chore(
            choreId = choreResponse.choreId,
            title = choreResponse.title,
            startDate = choreResponse.startDate,
            endDate = choreResponse.endDate,
            startTime = choreResponse.startTime,
            endTime = choreResponse.endTime,
            daysOfWeek = choreResponse.daysOfWeek,
            description = choreResponse.description,
            priority = choreResponse.priority,
            finished = choreResponse.finished,
            color = choreResponse.color
        )

        when (choreResponse) {
            is GroceryChoreResponse -> {
                return GroceryChore(
                    chore = baseChore,
                    items = choreResponse.items
                )
            }
            is CollegeChoreResponse -> {
                return CollegeChore(
                    chore = baseChore,
                    subject = choreResponse.subject,
                    location = choreResponse.location,
                    professor = choreResponse.professor,
                    totalHours = choreResponse.totalHours,
                    failed = choreResponse.failed,
                    absencesAllowed = choreResponse.absencesAllowed,
                    absencesCurrent = choreResponse.absencesCurrent
                )
            }

            is GymChoreResponse -> {
                return GymChore(
                    chore = baseChore,
                    exerciseDay = choreResponse.exerciseDay,
                    workout = choreResponse.workout
                )
            }

            else -> {
                return baseChore
            }
        }
    }

    fun toResponse(chore: Chore) : ChoreResponseBase {
        when (chore) {
            is GroceryChore -> {
                return GroceryChoreResponse(
                    choreId = chore.choreId,
                    startTime = chore.startTime,
                    endTime = chore.endTime,
                    daysOfWeek = chore.daysOfWeek,
                    startDate = chore.startDate,
                    endDate = chore.endDate,
                    choreException = chore.choreException,
                    title = chore.title,
                    description = chore.description,
                    priority = chore.priority,
                    deleted = chore.deleted,
                    finished = chore.finished,
                    color = chore.color,
                    items = chore.items
                )
            }
            is CollegeChore -> {
                return CollegeChoreResponse(
                    choreId = chore.choreId,
                    startTime = chore.startTime,
                    endTime = chore.endTime,
                    daysOfWeek = chore.daysOfWeek,
                    startDate = chore.startDate,
                    endDate = chore.endDate,
                    choreException = chore.choreException,
                    title = chore.title,
                    description = chore.description,
                    priority = chore.priority,
                    deleted = chore.deleted,
                    finished = chore.finished,
                    color = chore.color,
                    subject = chore.subject,
                    location = chore.location,
                    professor = chore.professor,
                    totalHours = chore.totalHours,
                    failed = chore.failed,
                    absencesAllowed = chore.absencesAllowed,
                    absencesCurrent = chore.absencesCurrent
                )
            }
            is GymChore -> {
                return GymChoreResponse(
                    choreId = chore.choreId,
                    startTime = chore.startTime,
                    endTime = chore.endTime,
                    daysOfWeek = chore.daysOfWeek,
                    startDate = chore.startDate,
                    endDate = chore.endDate,
                    choreException = chore.choreException,
                    title = chore.title,
                    description = chore.description,
                    priority = chore.priority,
                    deleted = chore.deleted,
                    finished = chore.finished,
                    color = chore.color,
                    exerciseDay = chore.exerciseDay,
                    workout = chore.workout
                )
            }
            else -> {
                return ChoreResponse(
                    choreId = chore.choreId,
                    startTime = chore.startTime,
                    endTime = chore.endTime,
                    daysOfWeek = chore.daysOfWeek,
                    startDate = chore.startDate,
                    endDate = chore.endDate,
                    choreException = chore.choreException,
                    title = chore.title,
                    description = chore.description,
                    priority = chore.priority,
                    deleted = chore.deleted,
                    finished = chore.finished,
                    color = chore.color
                )
            }
        }
    }
}