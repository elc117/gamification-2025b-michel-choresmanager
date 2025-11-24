package com.altmann.choresmanager.utils

import api.model.response.ChoreResponseBase
import api.model.response.CollegeChoreResponse
import api.model.response.GroceryChoreResponse
import api.model.response.GymChoreResponse
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.chores.grocery.GroceryChore
import com.altmann.choresmanager.models.chores.gym.GymChore

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
}