package com.altmann.choresmanager.utils

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.altmann.choresmanager.theming.AppTheme
import com.altmann.choresmanager.theming.materialColorSchemeFrom
import com.materialkolor.LocalDynamicMaterialThemeSeed
import com.materialkolor.MaterialKolors
import com.materialkolor.dynamicColorScheme
import com.materialkolor.dynamiccolor.MaterialDynamicColors

object ColorHelper {
    fun generateColorsFromPrimary(
        color: Color,
        isDark: Boolean = false
    ): AppTheme {

        val scheme = dynamicColorScheme(color, isDark)

        return AppTheme(
            primary = scheme.primary,
            onPrimary = scheme.onPrimary,
            secondary = scheme.secondary,
            onSecondary = scheme.onSecondary,
            background = scheme.background,
            onBackground = scheme.onBackground,
            primaryContainer = scheme.primaryContainer,
            onPrimaryContainer = scheme.onPrimaryContainer,
            secondaryContainer = scheme.secondaryContainer,
            onSecondaryContainer = scheme.onSecondaryContainer,
            surface = scheme.surface,
            onSurface = scheme.onSurface,
            surfaceVariant = scheme.surfaceVariant,
            onSurfaceVariant = scheme.onSurfaceVariant,
            surfaceContainerHighest = scheme.surfaceContainerHighest,
            error = scheme.error,
            isDark = isDark
        )
    }

    fun readableOn(color: Color): Color {
        val hsl = color.toHSL()
        val isBrightYellowish = (hsl[0] in 40f..120f) || hsl[2] > 0.65f
        val isDark = hsl[2] < 0.55f

        return if (isBrightYellowish) Color.Black
        else if (isDark) Color.White
        else Color.Black
    }

    fun Color.toHSL(): FloatArray {
        val r = this.red
        val g = this.green
        val b = this.blue

        val max = maxOf(r, g, b)
        val min = minOf(r, g, b)
        val hsl = FloatArray(3)

        // Calculate Lightness
        hsl[2] = ((max + min) / 2f).coerceIn(0f, 1f)

        val delta = max - min

        // Calculate Saturation
        hsl[1] = if (delta == 0f) {
            0f
        } else {
            (delta / (1f - kotlin.math.abs(2f * hsl[2] - 1f))).coerceIn(0f, 1f)
        }

        // Calculate Hue
        hsl[0] = when (max) {
            min -> 0f
            r -> (60f * ((g - b) / delta) + 360f) % 360f
            g -> (60f * ((b - r) / delta) + 120f)
            b -> (60f * ((r - g) / delta) + 240f)
            else -> 0f
        }

        return hsl
    }
}