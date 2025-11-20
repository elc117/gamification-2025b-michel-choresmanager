package com.altmann.choresmanager

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.altmann.choresmanager.theming.AppTheme
import com.altmann.choresmanager.theming.ThemeProvider
import com.altmann.choresmanager.ui.screens.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val themeState = remember {
        mutableStateOf(
            AppTheme()
        )
    }
    ThemeProvider(themeState) {
        HomeScreen()
    }
}