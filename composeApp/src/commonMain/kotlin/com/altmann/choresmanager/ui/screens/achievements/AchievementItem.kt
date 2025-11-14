package com.altmann.choresmanager.ui.screens.achievements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.Achievement

@Composable
fun AchievementItem(
    achievement: Achievement,
    modifier: Modifier = Modifier,
    achieved: Boolean,
    height: Dp = 64.dp
) {
    Surface(
        tonalElevation = 2.dp,
        modifier = modifier.padding(4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().height(height)
        ) {

            val grayscaleMatrix = ColorMatrix().apply {
                setToSaturation(0f)
            }

            Surface(
                shape = RoundedCornerShape(height/8),
                modifier = Modifier
                    .size(height)
                    .padding(8.dp)
            ) {
                Image(
                    imageVector = achievement.icon,
                    contentDescription = "${achievement.title} icon",
                    modifier = Modifier.fillMaxSize(),
                    colorFilter = ColorFilter.colorMatrix(grayscaleMatrix).takeIf { !achieved },
                    contentScale = ContentScale.Fit
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(text = achievement.title)
                Spacer(Modifier.height(4.dp))
                Text(text = achievement.description)
                Spacer(Modifier.height(4.dp))
                Text(text = achievement.difficulty.text)
                Spacer(Modifier.height(4.dp))
            }

        }
    }
}