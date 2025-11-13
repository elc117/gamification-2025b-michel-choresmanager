package com.altmann.choresmanager.models

import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.LocalDate

data class User(
    val userId: Int,
    val name: String,
    val birthday: LocalDate,
    val profileImage: List<Byte>?,
    var currentExp: Int = 10,
    var lvlUpThreshold : Int = 100,
    val achievements: List<Int> = emptyList(),
    val completedChores: List<Chore> = emptyList(),
    val createdChores: Int = 0,
    var level: Int = 1
    ) {

    fun gainExp(amount : Int) : User {
        if (amount == 0) return this
        val withGain = copy(currentExp = (currentExp + amount).coerceAtLeast(0))
        return withGain.rolloverIfNeeded()
    }

    val progress : Float get() = currentExp.toFloat() / lvlUpThreshold.toFloat()

    fun levelUp() : User{
        val overflow = (currentExp - lvlUpThreshold).coerceAtLeast(0)
        val nextLevel = level + 1
        val nextThreshold = (lvlUpThreshold * 1.2).toInt()
        print("Leveled Up! $level")
        return copy(
            level = nextLevel,
            currentExp = overflow,
            lvlUpThreshold = nextThreshold
        )
    }

    private fun rolloverIfNeeded() : User {
        var u = this
        while (u.currentExp >= u.lvlUpThreshold) {
            u = u.levelUp()
        }
        return u
    }


}