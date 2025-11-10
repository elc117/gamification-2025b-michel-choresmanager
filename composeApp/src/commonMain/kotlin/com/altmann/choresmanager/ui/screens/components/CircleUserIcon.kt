package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import choresmanager.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun CircleUserIcon(
    imageResource: DrawableResource,
    size: Dp = 48.dp,
    borderWidth: Dp = 0.dp,
    borderColor: Color = MaterialTheme.colorScheme.primary,
    contentDescription: String = "User Icon",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .border(
                width = borderWidth,
                color = borderColor,
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = contentDescription,
            modifier = Modifier.size(size),
            contentScale = ContentScale.Crop
        )
    }
}

// Overload with a solid color background fallback
@Composable
fun CircleUserIcon(
    imageResource: DrawableResource?,
    size: Dp = 48.dp,
    borderWidth: Dp = 0.dp,
    borderColor: Color = MaterialTheme.colorScheme.primary,
    fallbackBackgroundColor: Color = MaterialTheme.colorScheme.surfaceContainer,
    contentDescription: String = "User Icon",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(fallbackBackgroundColor)
            .border(
                width = borderWidth,
                color = borderColor,
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        if (imageResource != null) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = contentDescription,
                modifier = Modifier.size(size),
                contentScale = ContentScale.Crop
            )
        } else {
            // Fallback to initials or icon
            Text(
                text = "?",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

