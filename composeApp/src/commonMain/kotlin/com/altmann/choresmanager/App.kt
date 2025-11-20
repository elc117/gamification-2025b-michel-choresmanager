package com.altmann.choresmanager

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.theming.AppTheme
import com.altmann.choresmanager.theming.ThemeProvider
import com.altmann.choresmanager.ui.screens.home.HomeScreen
import com.altmann.choresmanager.utils.ColorHelper.generateColorsFromPrimary
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val initialTheme =
        generateColorsFromPrimary(color = Color.hsl(258f, 0.3f, 0.46f), isDark = false)
    val themeState = remember {
        mutableStateOf(
            initialTheme
        )
    }
    ThemeProvider(themeState) {
        HomeScreen()
    }
}