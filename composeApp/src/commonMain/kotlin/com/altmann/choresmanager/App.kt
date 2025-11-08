package com.altmann.choresmanager

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.altmann.choresmanager.ui.screens.calendar.CalendarScreen
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<CalendarViewModel>()
        CalendarScreen(viewModel)
    }
}