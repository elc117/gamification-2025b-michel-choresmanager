package com.altmann.choresmanager.ui.screens.components.pickers

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
expect fun ColorPicker(
    onColorSelected : (Color) -> Unit,
    selectedColor : Color = Color.Red
)