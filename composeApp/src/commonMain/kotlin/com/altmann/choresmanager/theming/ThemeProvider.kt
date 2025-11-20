package com.altmann.choresmanager.theming

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember

@Composable
fun ThemeProvider(
    themeState: MutableState<AppTheme>,
    content: @Composable () -> Unit
) {
    val controller = remember { ThemeController(themeState) }
    CompositionLocalProvider(
        LocalAppTheme provides themeState.value,
        LocalThemeController provides controller
    ) {
        MaterialTheme(
            colorScheme = materialColorSchemeFrom(themeState.value, themeState.value.isDark)
        ) {
            content()
        }
    }
}

@Composable
fun materialColorSchemeFrom(appTheme: AppTheme, isDark: Boolean): ColorScheme {
    return if (isDark) {
        darkColorScheme(
            primary = appTheme.primary,
            onPrimary = appTheme.onPrimary,
            secondary = appTheme.secondary,
            onSecondary = appTheme.onSecondary,
            background = appTheme.background,
            onBackground = appTheme.onBackground,
            primaryContainer = appTheme.primaryContainer,
            onPrimaryContainer = appTheme.onPrimaryContainer,
            secondaryContainer = appTheme.secondaryContainer,
            onSecondaryContainer = appTheme.onSecondaryContainer,
            surface = appTheme.surface,
            onSurface = appTheme.onSurface,
            surfaceVariant = appTheme.surfaceVariant,
            onSurfaceVariant = appTheme.onSurfaceVariant,
            surfaceContainerHighest = appTheme.surfaceContainerHighest,
            error = appTheme.error
        )
    } else {
        lightColorScheme(
            primary = appTheme.primary,
            onPrimary = appTheme.onPrimary,
            secondary = appTheme.secondary,
            onSecondary = appTheme.onSecondary,
            background = appTheme.background,
            onBackground = appTheme.onBackground,
            primaryContainer = appTheme.primaryContainer,
            onPrimaryContainer = appTheme.onPrimaryContainer,
            secondaryContainer = appTheme.secondaryContainer,
            onSecondaryContainer = appTheme.onSecondaryContainer,
            surface = appTheme.surface,
            onSurface = appTheme.onSurface,
            surfaceVariant = appTheme.surfaceVariant,
            onSurfaceVariant = appTheme.onSurfaceVariant,
            surfaceContainerHighest = appTheme.surfaceContainerHighest,
            error = appTheme.error,
        )
    }
}
