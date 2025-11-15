package com.altmann.choresmanager.ui.screens.components.pickers

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
actual fun ColorPicker(
    onColorSelected: (Color) -> Unit,
    selectedColor: Color
) {
    val defaultColors = listOf(
        Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Cyan,
        Color.Magenta, Color.Black, Color.White, Color.Gray, Color.DarkGray, Color.LightGray
    )

    Surface {
        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                // show default color as a label
                Text("Selected:", color = Color.Black)
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(selectedColor)
                )
            }
            // simple grid-like list of color boxes
            Column {
                defaultColors.chunked(4).forEach { row ->
                    Row{
                        row.forEach { color ->
                            ColorItem(color = color, onColorSelected = onColorSelected)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ColorItem(
    color: Color,
    onColorSelected: (Color) -> Unit
) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = color,
        modifier = Modifier
            .size(36.dp)
            .padding(2.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { onColorSelected(color) }
    ){}
}