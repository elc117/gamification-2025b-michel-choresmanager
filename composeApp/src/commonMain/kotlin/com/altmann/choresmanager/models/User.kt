package com.altmann.choresmanager.models

import kotlinx.datetime.LocalDate

data class User(
    val userId: Int,
    val name: String,
    val birthday: LocalDate,
    val profileImage: List<Byte>?,
    var currentExp: Int = 0,
    var expToLevelUp : Int = 100,
    val achievements: List<Achievement> = emptyList(),
    var level: Int = 1
    ) {

    fun levelUp() {
        while (currentExp >= expToLevelUp) {
            currentExp -= expToLevelUp
            level += if (expToLevelUp == 0) 1 else 0
            expToLevelUp = (expToLevelUp * 1.2).toInt() // Increase required EXP by 20% for next level
        }
    }



}