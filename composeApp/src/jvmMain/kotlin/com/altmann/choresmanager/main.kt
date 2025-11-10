package com.altmann.choresmanager

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.altmann.choresmanager.di.initializeKoin

fun main() = application {
        initializeKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "ChoresManager",
        state = WindowState(width = 1200.dp, height = 820.dp)
    ) {
        App()
    }
}