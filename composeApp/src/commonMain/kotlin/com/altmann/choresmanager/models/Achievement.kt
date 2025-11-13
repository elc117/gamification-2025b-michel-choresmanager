package com.altmann.choresmanager.models


data class Achievement(
    val id: Int,
    val title: String,
    val description: String,
    val difficulty: AchievementDifficulty,
    val icon: String // Could be a URL or resource identifier,
){
    val exp : Int get() = difficulty.value * 50
}

enum class AchievementDifficulty(val text : String, val value : Int) {
    EASY("Easy", 1),
    MEDIUM("Medium", 2),
    HARD("Hard", 3),
    LEGENDARY("Legendary", 5)
}
