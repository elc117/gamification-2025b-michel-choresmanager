package com.altmann.choresmanager.utils

import com.altmann.choresmanager.models.user.achievements
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.user.Achievement

class AchievementHelper(
    private val completedAchievements: List<Int>,
    private val chore: Chore?,
    private val isChoreCompleted : Boolean,
    private val completedChores: Int,
    private val createdChores: Int
) {
    private val newAchievements = mutableListOf<Achievement>()
    private var expGained = 0

    // Returns a Pair of (List of new achievement IDs, total EXP gained)
    fun checkForNewAchievements(): Pair<List<Achievement>, Int> {
        for (achievement in achievements) {
            // Skip if already completed
            if (achievement.id in completedAchievements) continue
            when (achievement.id) {
                0 -> { // Complete 1 chore!
                    if (completedChores > 0) {
                        add(0)
                    }
                }

                1 -> { // Complete 5 chores
                    if (completedChores >= 5) {
                        add(1)
                    }
                }

                2 -> { // Complete 10 chores
                    if (completedChores >= 10) {
                        add(2)
                    }
                }

                3 -> { // Complete 25 chores
                    if (completedChores >= 25) {
                        add(3)
                    }
                }

                4 -> {
                    if (completedChores >= 50) {
                        add(4)
                    }
                }

                5 -> {
                    if (createdChores >= 5) {
                        add(5)
                    }
                }

                6 -> {
                    if (createdChores >= 10) {
                        add(6)
                    }
                }

                7 -> {
                    if (createdChores >= 25) {
                        add(7)
                    }
                }

                8 -> {
                    if (createdChores >= 50) {
                        add(8)
                    }
                }

                9 -> {
                    if (createdChores >= 100) {
                        add(9)
                    }
                }

                10 -> {
                    if (chore != null && chore.duration() >= 120 && isChoreCompleted) {
                        add(10)
                    }
                }

                11 -> {
                    if (chore != null && chore.duration() >= 240 && isChoreCompleted) {
                        add(11)
                    }
                }

                12 -> {
                    if (chore != null && chore.duration() >= 360 && isChoreCompleted) {
                        add(12)
                    }
                }

                13 -> {
                    if (chore != null && chore.duration() >= 600 && isChoreCompleted) {
                        add(13)
                    }
                }

                14 -> {
                    if (chore != null && chore.duration() >= 720 && isChoreCompleted) {
                        add(14)
                    }
                }
            }
        }
        return (newAchievements to expGained)
    }

    fun add(id: Int) {
        newAchievements.add(achievements[id])
        expGained = expGained + achievements[id].exp
    }

}

