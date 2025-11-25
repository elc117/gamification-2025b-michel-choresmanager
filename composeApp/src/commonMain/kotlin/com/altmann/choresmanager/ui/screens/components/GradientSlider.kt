package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun GradientSlider(
    value: Float = 0f,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    active : Boolean = true,
    gradient : List<Color> = listOf(),
    range : ClosedFloatingPointRange<Float> = 0f..1f,
    inactiveTrackColor : Color
) {
    val brush = Brush.horizontalGradient(gradient)
    Box(
        modifier,
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .background(
                    brush = brush,
                    shape = RoundedCornerShape(8.dp)
                )
        )
        Slider(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            enabled = active,
            valueRange = range,
            colors = SliderDefaults.colors(
                thumbColor = Color.White,
                activeTrackColor = Color.Transparent,
                inactiveTrackColor = inactiveTrackColor
            ),
            modifier = Modifier.fillMaxSize()
        )
    }
}