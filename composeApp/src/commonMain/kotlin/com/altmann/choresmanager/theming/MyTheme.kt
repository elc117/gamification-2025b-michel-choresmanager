package com.altmann.choresmanager.theming

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalAppTheme = staticCompositionLocalOf<AppTheme> {
    error("No theme provided")
}

object MyTheme {
    val colors: AppTheme
        @Composable get() = LocalAppTheme.current
}