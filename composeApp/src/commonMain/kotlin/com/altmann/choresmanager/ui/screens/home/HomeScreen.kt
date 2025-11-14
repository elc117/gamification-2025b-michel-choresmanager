package com.altmann.choresmanager.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.achievements.AchievementsScreen
import com.altmann.choresmanager.ui.screens.calendar.CalendarScreen
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import com.altmann.choresmanager.ui.screens.sidebar.SideBar
import com.altmann.choresmanager.ui.screens.sidebar.SideBarViewModel
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen() {
    val calendarViewModel = koinViewModel<CalendarViewModel>()
    val sideBarViewModel = koinViewModel<SideBarViewModel>()
//    val achievementsViewModel = koinViewModel<AchievementsViewModel>()
    Row(modifier = Modifier.fillMaxSize()) {
        SideBar(sideBarViewModel)
//        CalendarScreen(calendarViewModel)
        AchievementsScreen(sideBarViewModel.user.value.achievements,
            modifier = Modifier.weight(1f).fillMaxHeight())
    }
}