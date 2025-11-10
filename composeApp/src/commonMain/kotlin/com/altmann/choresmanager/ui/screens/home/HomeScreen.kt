package com.altmann.choresmanager.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.calendar.CalendarScreen
import com.altmann.choresmanager.ui.screens.home.HomeViewModel
import com.altmann.choresmanager.ui.screens.sidebar.SideBar
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen() {
    val viewModel = koinViewModel<HomeViewModel>()
    Row {
        SideBar(viewModel)
        CalendarScreen(viewModel)
    }
}