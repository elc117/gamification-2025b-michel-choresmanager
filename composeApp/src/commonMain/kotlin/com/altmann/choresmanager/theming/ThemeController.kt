package com.altmann.choresmanager.theming

import androidx.compose.runtime.MutableState

class ThemeController(
    val themeState: MutableState<AppTheme>
) {
    fun setPrimary(appTheme: AppTheme) {
        themeState.value = appTheme
    }
}