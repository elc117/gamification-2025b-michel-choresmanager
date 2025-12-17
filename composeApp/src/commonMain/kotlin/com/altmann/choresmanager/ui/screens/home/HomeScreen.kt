package com.altmann.choresmanager.ui.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.user.Achievement
import com.altmann.choresmanager.theming.MyTheme
import com.altmann.choresmanager.ui.screens.achievements.AchievementItem
import com.altmann.choresmanager.ui.screens.achievements.AchievementsScreen
import com.altmann.choresmanager.ui.screens.calendar.CalendarScreen
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import com.altmann.choresmanager.ui.screens.sidebar.SideBar
import com.altmann.choresmanager.ui.screens.sidebar.SideBarViewModel
import com.altmann.choresmanager.ui.screens.themeselector.ThemeSelectorScreen
import com.altmann.choresmanager.utils.ColorHelper.generateColorsFromPrimary
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen() {
    val calendarViewModel = koinViewModel<CalendarViewModel>()
    val sideBarViewModel = koinViewModel<SideBarViewModel>()
    val sharedChoreViewModel = koinViewModel<SharedChoreViewModel>()

    var screen = remember { mutableStateOf(0) }
    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val user = sharedChoreViewModel.user.collectAsState()
    val newAchievements = sharedChoreViewModel.newAchievements.collectAsState()

    LaunchedEffect(user.value) {
        sharedChoreViewModel.updateUser(user.value)
    }

    MyTheme.controller.setPrimary(
        generateColorsFromPrimary(
            user.value.color?.let { it } ?: MyTheme.theme.primary,
            user.value.isDarkTheme
        )
    )

    LaunchedEffect(newAchievements.value) {
        if (newAchievements.value.isNotEmpty()) {
            scope.launch {
                snackBarHostState.showSnackbar("Achievement Unlocked!")
                delay(4000)
                sharedChoreViewModel.clearNewAchievements()
            }
        }
    }

    Scaffold(
        snackbarHost = {
            Box(
                modifier = Modifier.fillMaxSize().padding(top = 8.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                SnackbarHost(snackBarHostState) { data ->
                    AchievementSnackBarContent(newAchievements.value)
                }
            }
        }
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            //    val achievementsViewModel = koinViewModel<AchievementsViewModel>()
            Row(
                modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)
            ) {
//                SideBar(sideBarViewModel, screen)
                when (screen.value) {
                    0 -> CalendarScreen(calendarViewModel)
                    1 -> AchievementsScreen(
                        sideBarViewModel.user.value.achievements,
                        modifier = Modifier.weight(1f).fillMaxHeight()
                    )

                    2 -> ThemeSelectorScreen(sharedChoreViewModel)
                }

            }
        }
    }
}

@Composable
fun AchievementSnackBarContent(newAchievements: List<Achievement>) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.background(Color.Transparent)
    ) {
        Surface(
            shadowElevation = 4.dp,
            shape = RoundedCornerShape(8.dp),
            tonalElevation = 6.dp,
            modifier = Modifier.padding(4.dp).width(300.dp).height(32.dp)
        ) {
            Text(
                "Achievements Unlocked!",
                modifier = Modifier.fillMaxSize(),
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        newAchievements.forEach { achievement ->
            Surface(
                shadowElevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                tonalElevation = 6.dp,
                modifier = Modifier.padding(4.dp).width(300.dp).height(74.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .size(64.dp)
                            .padding(8.dp)
                    ) {
                        Image(
                            imageVector = achievement.icon,
                            contentDescription = "${achievement.title} icon",
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        achievement.title
                    )
                }
            }
        }
    }
}