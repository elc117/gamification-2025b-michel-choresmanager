package com.altmann.choresmanager.utils

import com.altmann.choresmanager.models.Achievement
import com.altmann.choresmanager.models.achievements
import com.altmann.choresmanager.models.chores.Chore

class AchievementHelper(
    private val completedAchievements: List<Int>,
    private val completedChore: Chore?,
    private val completedChores: Int,
    private val createdChores: Int
) {
    private val newAchievements = mutableListOf<Int>()
    private var expGained = 0

    // Returns a Pair of (List of new achievement IDs, total EXP gained)
    fun checkForNewAchievements(): Pair<List<Int>, Int> {
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
                    if (completedChore != null && completedChore.duration() >= 120) {
                        add(10)
                    }
                }

                11 -> {
                    if (completedChore != null && completedChore.duration() >= 240) {
                        add(11)
                    }
                }

                12 -> {
                    if (completedChore != null && completedChore.duration() >= 360) {
                        add(12)
                    }
                }

                13 -> {
                    if (completedChore != null && completedChore.duration() >= 600) {
                        add(13)
                    }
                }

                14 -> {
                    if (completedChore != null && completedChore.duration() >= 720) {
                        add(14)
                    }
                }
            }
        }
        return (newAchievements to expGained)
    }

    fun add(id: Int) {
        newAchievements.add(id)
        expGained = expGained + achievements[id].exp
    }

}

