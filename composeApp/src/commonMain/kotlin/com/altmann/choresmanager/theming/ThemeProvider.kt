package com.altmann.choresmanager.theming

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState

@Composable
fun ThemeProvider(
    themeState: MutableState<AppTheme>,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalAppTheme provides themeState.value,
    ) {
        MaterialTheme(
//            colorScheme = materialColorSchemeFrom(themeState.value)
        ) {
            content()
        }
    }
}

@Composable
fun materialColorSchemeFrom(appTheme: AppTheme) = lightColorScheme(
    primary = appTheme.primary,
    onPrimary = appTheme.onPrimary,
    background = appTheme.background,
    onBackground = appTheme.onBackground,
    primaryContainer = appTheme.primaryContainer,
    onPrimaryContainer = appTheme.primaryContainer,
    surface = appTheme.surface,
    onSurface = appTheme.onSurface,
    surfaceVariant = appTheme.surfaceVariant,
    onSurfaceVariant = appTheme.onSurfaceVariant,
)