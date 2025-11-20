package com.altmann.choresmanager.theming

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalAppTheme = staticCompositionLocalOf<AppTheme> {
    error("No theme provided")
}

val LocalThemeController = staticCompositionLocalOf<ThemeController> {
    error("ThemeController not provided")
}

object MyTheme {
    val theme: AppTheme
        @Composable get() = LocalAppTheme.current

    val controller: ThemeController
        @Composable get() = LocalThemeController.current
}