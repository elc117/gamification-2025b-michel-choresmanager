package com.altmann.choresmanager.utils

import com.altmann.choresmanager.models.achievements
import com.altmann.choresmanager.models.chores.Chore

class AchievementHelper(private val completedAchievements: List<Int>, private val completedChores : List<Chore>, private val createdChores : Int) {
    // Returns a Pair of (List of new achievement IDs, total EXP gained)
    fun checkForNewAchievements() : Pair<List<Int>, Int> {
        val newAchievements = mutableListOf<Int>()
        var expGained : Int = 0
        for (achievement in achievements) {
            // Skip if already completed
            if (achievement.id in completedAchievements) continue
            when (achievement.id) {
                0 -> { // Your first chore!
                    if (createdChores > 0) {
                        newAchievements.add(0)
                        expGained = expGained + achievement.exp
                    }
                }
                1 -> { // Complete 1 chore
                    if (completedChores.isNotEmpty()) {
                        newAchievements.add(1)
                        expGained = expGained + achievement.exp
                    }
                }
                2 -> { // Complete 5 chores
                    if (completedChores.size >= 5) {
                        newAchievements.add(2)
                        expGained = expGained + achievement.exp
                    }
                }
                3 -> { // Complete a chore with duration > 4 hours}
                    if (completedChores.any { it.duration() > 4 }) {
                        newAchievements.add(3)
                        expGained = expGained + achievement.exp
                    }
                }
            }
        }
        return (newAchievements to expGained)
    }

}
