package com.altmann.choresmanager.models

import androidx.compose.ui.graphics.vector.ImageVector
import com.altmann.choresmanager.res.MyAchievementsPack
import com.altmann.choresmanager.res.myiconpack.Completed10Achievement
import com.altmann.choresmanager.res.myiconpack.Completed1Achievement
import com.altmann.choresmanager.res.myiconpack.Completed25Achievement
import com.altmann.choresmanager.res.myiconpack.Completed50Achievement
import com.altmann.choresmanager.res.myiconpack.Completed5Achievement
import com.altmann.choresmanager.res.myiconpack.Created100Achievement
import com.altmann.choresmanager.res.myiconpack.Created10Achievement
import com.altmann.choresmanager.res.myiconpack.Created25Achievement
import com.altmann.choresmanager.res.myiconpack.Created50Achievement
import com.altmann.choresmanager.res.myiconpack.Created5Achievement
import com.altmann.choresmanager.res.myiconpack.Duration10Achievement
import com.altmann.choresmanager.res.myiconpack.Duration12Achievement
import com.altmann.choresmanager.res.myiconpack.Duration2Achievement
import com.altmann.choresmanager.res.myiconpack.Duration4Achievement
import com.altmann.choresmanager.res.myiconpack.Duration6Achievement
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.datetime.LocalDate


data class Achievement(
    val id: Int,
    val title: String,
    val description: String,
    val difficulty: AchievementDifficulty,
    var completedDate: LocalDate = CalendarHelper.today(),
    val icon: ImageVector
){
    val exp : Int get() = difficulty.value * 50
}

enum class AchievementDifficulty(val text : String, val value : Int) {
    EASY("Easy", 1),
    MEDIUM("Medium", 2),
    HARD("Hard", 3),
    LEGENDARY("Legendary", 5)
}


val achievements : List<Achievement> =
    listOf<Achievement>(
        Achievement(
            id = 0,
            title = "Your first chore!",
            description = "Complete your first chore.",
            difficulty = AchievementDifficulty.EASY,
            icon = MyAchievementsPack.Completed1Achievement
        ),
        Achievement(
            id = 1,
            title = "Getting things done",
            description = "Complete 5 chores.",
            difficulty = AchievementDifficulty.MEDIUM,
            icon = MyAchievementsPack.Completed5Achievement
        ),
        Achievement(
            id = 2,
            title = "Chore enjoyer",
            description = "Complete 10 chores.",
            difficulty = AchievementDifficulty.MEDIUM,
            icon = MyAchievementsPack.Completed10Achievement
        ),Achievement(
            id = 3,
            title = "Not letting go",
            description = "Complete 25 chores.",
            difficulty = AchievementDifficulty.HARD,
            icon = MyAchievementsPack.Completed25Achievement
        ),Achievement(
            id = 4,
            title = "Chore eater",
            description = "Complete 50 chores.",
            difficulty = AchievementDifficulty.LEGENDARY,
            icon = MyAchievementsPack.Completed50Achievement
        ),Achievement(
            id = 5,
            title = "Your first batch!",
            description = "Create 5 chores.",
            difficulty = AchievementDifficulty.EASY,
            icon = MyAchievementsPack.Created5Achievement
        ), Achievement(
            id = 6,
            title = "Setting up",
            description = "Create 10 chores.",
            difficulty = AchievementDifficulty.MEDIUM,
            icon = MyAchievementsPack.Created10Achievement
        ),Achievement(
            id = 7,
            title = "Workload",
            description = "Create 25 chores.",
            difficulty = AchievementDifficulty.MEDIUM,
            icon = MyAchievementsPack.Created25Achievement
        ),Achievement(
            id = 8,
            title = "Chore creator",
            description = "Create 50 chores.",
            difficulty = AchievementDifficulty.HARD,
            icon = MyAchievementsPack.Created50Achievement
        ),Achievement(
            id = 9,
            title = "Chore hoarder",
            description = "Create 100 chores.",
            difficulty = AchievementDifficulty.LEGENDARY,
            icon = MyAchievementsPack.Created100Achievement
        ),Achievement(
            id = 10,
            title = "That was easy",
            description = "Complete a 2 hour long chore.",
            difficulty = AchievementDifficulty.EASY,
            icon = MyAchievementsPack.Duration2Achievement
        ),
        Achievement(
            id = 11,
            title = "A little longer",
            description = "Complete a 4 hour long chore.",
            difficulty = AchievementDifficulty.MEDIUM,
            icon = MyAchievementsPack.Duration4Achievement
        ),
        Achievement(
            id = 12,
            title = "That took some time",
            description = "Complete a 6 hour long chore.",
            difficulty = AchievementDifficulty.MEDIUM,
            icon = MyAchievementsPack.Duration6Achievement
        ),
        Achievement(
            id = 13,
            title = "Finally done!",
            description = "Complete a 10 hour long chore.",
            difficulty = AchievementDifficulty.HARD,
            icon = MyAchievementsPack.Duration10Achievement
        ),
        Achievement(
            id = 14,
            title = "That took forever",
            description = "Complete a 12 hour long chore.",
            difficulty = AchievementDifficulty.LEGENDARY,
            icon = MyAchievementsPack.Duration12Achievement
        )
    )