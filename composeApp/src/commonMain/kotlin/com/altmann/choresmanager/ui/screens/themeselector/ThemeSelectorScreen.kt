package com.altmann.choresmanager.ui.screens.themeselector

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSliderState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalGraphicsContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.components.pickers.HslColorPicker

@Composable
fun ThemeSelectorScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Theme Selector", color = MaterialTheme.colorScheme.onBackground)
        var color by remember { mutableStateOf(Color.Red) }
        Row {
            Surface(
                color = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.padding(12.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                HslColorPicker(
                    modifier = Modifier.padding(8.dp),
                    onColorChanged = { colorPicked ->
                        color = colorPicked
                    }
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Surface(
                color = color,
                modifier = Modifier.size(300.dp).padding(12.dp),
                shape = RoundedCornerShape(8.dp),
            ) {
                Text(
                    "Testing",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
        }
    }
}