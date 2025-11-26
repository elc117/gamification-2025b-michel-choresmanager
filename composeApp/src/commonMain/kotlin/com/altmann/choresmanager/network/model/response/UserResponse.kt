package com.altmann.choresmanager.network.model.response

import androidx.compose.ui.graphics.Color
import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse (
    val id : Int,
    val name : String,
    val email : String,
    @Contextual
    val birthdate : LocalDate?,
    val profileImage : String?,
    val currentExp : Int,
    val achievements : List<Int>,
    val levelUpThreshold: Int,
    val level : Int,
    val completedChores : Int,
    val createdChores : Int,
    @Contextual
    val color : Color?,
    val isDarkTheme : Boolean
)