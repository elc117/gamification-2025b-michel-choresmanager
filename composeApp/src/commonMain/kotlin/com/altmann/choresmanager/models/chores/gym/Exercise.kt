package com.altmann.choresmanager.models.chores.gym

class Exercise(
    val exerciseId: Int,
    val name: String,
    val sets : Int?,
    val reps : Int?,
    val restTimeSeconds : Int?
)