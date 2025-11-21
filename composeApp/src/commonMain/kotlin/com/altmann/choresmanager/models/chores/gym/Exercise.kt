package com.altmann.choresmanager.models.chores.gym

data class Exercise(
    val exerciseId: String,
    val name: String,
    val sets: Int?,
    val reps: Int?
)