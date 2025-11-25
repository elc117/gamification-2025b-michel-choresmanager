package com.altmann.choresmanager.ui.screens.components.pickers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.components.GradientSlider
import com.altmann.choresmanager.utils.ColorHelper.toHSL

@Composable
fun HslColorPicker(
    onColorChanged : (Color) -> Unit,
    initialColor: Color = MaterialTheme.colorScheme.primary,
    active : Boolean = true,
    modifier: Modifier = Modifier
) {
    val initialHsl = initialColor.toHSL()
    var hue by remember { mutableStateOf(initialHsl[0]) }
    var saturation by remember { mutableStateOf(initialHsl[1]) }
    var lightness by remember { mutableStateOf(initialHsl[2]) }

    val colorsGradient = listOf(
        Color.hsl(0f, saturation, lightness),
        Color.hsl(60f, saturation, lightness),
        Color.hsl(120f, saturation, lightness),
        Color.hsl(180f, saturation, lightness),
        Color.hsl(240f, saturation, lightness),
        Color.hsl(300f, saturation, lightness),
        Color.hsl(360f, saturation, lightness)
    )

    val saturationGradient = listOf(
        Color.hsl(hue, 0f, lightness),
        Color.hsl(hue, 1f, lightness)
    )

    val lightnessGradient = listOf(
        Color.hsl(hue, saturation, 0f),
        Color.hsl(hue, saturation, 1f)
    )
    Column(modifier) {
        GradientSlider(
            value = hue,
            onValueChange = {
                hue = it
                onColorChanged(Color.hsl(hue, saturation, lightness))
            },
            active = active,
            gradient = colorsGradient,
            range = 0f..360f,
            inactiveTrackColor = Color.Transparent,
            modifier = Modifier.padding(4.dp).height(30.dp).width(200.dp)
        )
        GradientSlider(
            onValueChange = {
                saturation = it
                onColorChanged(Color.hsl(hue, saturation, lightness))
            },
            active = active,
            value = saturation,
            gradient = saturationGradient,
            inactiveTrackColor = Color.Transparent,
            modifier = Modifier.padding(4.dp).height(30.dp).width(200.dp)
        )
        GradientSlider(
            onValueChange = {
                lightness = it
                onColorChanged(Color.hsl(hue, saturation, lightness))
            },
            active = active,
            value = lightness,
            gradient = lightnessGradient,
            inactiveTrackColor = Color.Transparent,
            modifier = Modifier.padding(4.dp).height(30.dp).width(200.dp)
        )
    }
}