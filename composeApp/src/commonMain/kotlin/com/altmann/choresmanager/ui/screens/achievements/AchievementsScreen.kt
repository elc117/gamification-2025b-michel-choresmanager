package com.altmann.choresmanager.ui.screens.achievements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.achievements

@Composable
fun AchievementsScreen(achievementsAchieved: List<Int>, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        tonalElevation = 0.dp
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally){

            Text(text = "Achievements", modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.titleLarge)

            BoxWithConstraints(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                val totalWidth = maxWidth

                val columns = 3
                val spacing = 16.dp
                val contentPadding = 16.dp * 2 // left and right padding

                val itemWidth = ((totalWidth - contentPadding - (spacing * (columns - 1))) / columns).let { width ->
                    if (width > 500.dp) 500.dp else width
                }

                val itemHeight = (maxHeight / 5) - spacing * 2
                LazyHorizontalGrid(
                    rows = GridCells.Fixed(5),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(16.dp),
                    modifier = Modifier.wrapContentSize()
                ) {
                    items(achievements) { achievement ->
                        AchievementItem(
                            achievement,
                            achieved = achievementsAchieved.contains(achievement.id),
                            modifier = Modifier.width(itemWidth),
                            height = itemHeight
                        )
                    }
                }
            }

        }
    }
}