package com.altmann.choresmanager.ui.screens.themeselector

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.theming.AppTheme
import com.altmann.choresmanager.theming.MyTheme
import com.altmann.choresmanager.theming.ThemeProvider
import com.altmann.choresmanager.ui.screens.calendar.monthcalendar.DayCell
import com.altmann.choresmanager.ui.screens.components.pickers.HslColorPicker
import com.altmann.choresmanager.utils.CalendarHelper
import com.altmann.choresmanager.utils.ColorHelper.generateColorsFromPrimary
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

@Composable
fun ThemeSelectorScreen() {
    Column(
        modifier = Modifier.padding(bottom = 16.dp, start = 8.dp, top = 16.dp).fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val initialColor = MaterialTheme.colorScheme.primary
        val newColor = remember { mutableStateOf(initialColor) }
        var color by remember { mutableStateOf(initialColor) }
        val dark = MyTheme.theme.isDark
        var isDark by remember {
            mutableStateOf(dark)
        }
        val previewTheme = generateColorsFromPrimary(color, isDark)

        MyTheme.controller.themeState.value = generateColorsFromPrimary(newColor.value, isDark)
        Text(
            "Theme Selector", color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Row(Modifier.fillMaxWidth()) {
            Column {
                Button(
                    modifier = Modifier.width(250.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    onClick = {
                        isDark = !isDark
                    }
                ) {
                    Text(text = if (isDark) "Switch to Light Theme" else "Switch to Dark Theme")
                }
                Surface(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    modifier = Modifier.padding(12.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    HslColorPicker(
                        modifier = Modifier.padding(8.dp),
                        initialColor = color,
                        onColorChanged = { colorPicked ->
                            color = colorPicked
                        }
                    )
                }
                Button(
                    modifier = Modifier.width(250.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    onClick = {
                        newColor.value = color
                    }
                ) {
                    Text("Apply Theme")
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .width(1.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxHeight()
            )
            Spacer(modifier = Modifier.width(8.dp))
            ColorPreviewBox(previewTheme, modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable
fun ColorPreviewBox(previewTheme: AppTheme, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(previewTheme.background)
    ) {
        Text(
            text = "Theme Preview",
            color = previewTheme.onSurface,
            modifier = Modifier.padding(top = 4.dp)
        )
        Row {
            Surface(
                color = previewTheme.primaryContainer,
                border = BorderStroke(1.dp, previewTheme.primary),
                modifier = Modifier.padding(16.dp).size(150.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Theme Preview",
                    color = previewTheme.onPrimaryContainer,
                    modifier = Modifier.padding(top = 4.dp).fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(Modifier.height(8.dp))
            Surface(
                color = previewTheme.surfaceVariant,
                border = BorderStroke(1.dp, previewTheme.primary),
                modifier = Modifier.padding(16.dp).size(150.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Theme Preview",
                    color = previewTheme.onSurfaceVariant,
                    modifier = Modifier.padding(top = 4.dp).fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
        ThemeProvider(mutableStateOf(previewTheme)) {
            BoxWithConstraints() {
                val width = (maxWidth / 2) / 7
                val height = (maxHeight / 1.5f) / 6
                var selected by remember {
                    mutableStateOf(Pair(0, 0))
                }
                val (start, _) = remember {
                    CalendarHelper.monthGridWindow(CalendarHelper.today())
                }
                val days: List<LocalDate> =
                    remember(start) { (0 until 42).map { start.plus(DatePeriod(days = it)) } }
                Column {
                    for (i in 0 until 6) {
                        Row(modifier = Modifier.padding(2.dp)) {
                            for (j in 0 until 7) {
                                val day = days[i * 7 + j]
                                Box(modifier = Modifier.padding(2.dp)) {
                                    DayCell(
                                        faded = day.month != CalendarHelper.today().month,
                                        date = day,
                                        selected = selected.first == i && selected.second == j,
                                        onClick = {selected = Pair(i, j)},
                                        modifier = Modifier.width(width).height(height)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        Row {
            Button(
                onClick = {

                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.padding(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = previewTheme.secondary,
                    contentColor = previewTheme.onSecondary
                )
            ) {
                Text("Cancel")
            }
            Button(
                onClick = {

                },
                modifier = Modifier.padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = previewTheme.primary,
                    contentColor = previewTheme.onPrimary
                )
            ) {
                Text("Create")
            }
        }
        Spacer(modifier = Modifier.size(8.dp))

    }
}