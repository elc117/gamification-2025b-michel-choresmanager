package com.altmann.choresmanager.models.user

import com.altmann.choresmanager.models.chores.Chore
import kotlinx.datetime.LocalDate

data class User(
    val userId: Int,
    val name: String,
    val email : String,
    val birthday: LocalDate?,
    val profileImage: String? = null,
    var currentExp: Int = 10,
    val achievements: List<Int> = emptyList(),
    var lvlUpThreshold : Int = 100,
    var level: Int = 1,
    val completedChores: Int = 0,
    val createdChores: Int = 0
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