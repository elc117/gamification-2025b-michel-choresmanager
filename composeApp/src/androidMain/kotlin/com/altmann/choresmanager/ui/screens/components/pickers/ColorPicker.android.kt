package com.altmann.choresmanager.ui.screens.components.pickers

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kborowy.colorpicker.KolorPicker

@Composable
actual fun ColorPicker(
    onColorSelected: (Color) -> Unit,
    selectedColor: Color
) {
    KolorPicker(
        onColorSelected = onColorSelected,
        modifier = Modifier.width(250.dp).height(200.dp),
        initialColor = selectedColor
    )
}