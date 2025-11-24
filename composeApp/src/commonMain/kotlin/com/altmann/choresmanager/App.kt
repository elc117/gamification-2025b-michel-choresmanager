package com.altmann.choresmanager

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.theming.AppTheme
import com.altmann.choresmanager.theming.ThemeProvider
import com.altmann.choresmanager.ui.screens.home.HomeScreen
import com.altmann.choresmanager.ui.screens.login.LoginScreen
import com.altmann.choresmanager.ui.screens.login.LoginViewModel
import com.altmann.choresmanager.utils.ColorHelper.generateColorsFromPrimary
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    val initialTheme =
        generateColorsFromPrimary(color = Color.hsl(258f, 0.3f, 0.46f), isDark = true)
    val themeState = remember {
        mutableStateOf(
            initialTheme
        )
    }

    val screenState = remember {
        mutableStateOf(0)
    }

    val loginViewModel = koinViewModel<LoginViewModel>()
    ThemeProvider(themeState) {
        when (screenState.value){
            0 -> {LoginScreen(loginViewModel, screenState)}
            1 -> {HomeScreen()}
            else -> {}

        }
    }
}