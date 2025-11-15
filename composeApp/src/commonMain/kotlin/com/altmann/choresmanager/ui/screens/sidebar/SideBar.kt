package com.altmann.choresmanager.ui.screens.sidebar

import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.addchorepopup.AddChorePopup
import com.altmann.choresmanager.ui.screens.components.CircleUserIcon
import com.altmann.choresmanager.utils.CalendarHelper

@Composable
fun SideBar(viewModel: SideBarViewModel, screen: MutableState<Int>) {
    val chores by viewModel.chores.collectAsState()
    val user by viewModel.user.collectAsState()
    var addChorePopup by remember { mutableStateOf(false) }

    val progressAnim = remember { Animatable(user.progress.coerceIn(0f, 1f)) }
    var prevLevel by remember { mutableStateOf(user.level) }

    LaunchedEffect(user.level, user.progress) {
        val finalTarget = user.progress.coerceIn(0f, 1f)
        val current = progressAnim.value
        val levelsGained = (user.level - prevLevel).coerceAtLeast(0)
        val spec = ProgressIndicatorDefaults.ProgressAnimationSpec

        if (levelsGained > 0) {
            progressAnim.animateTo(1f, animationSpec = spec)

            repeat(levelsGained - 1) {
                progressAnim.snapTo(0f)
                progressAnim.animateTo(1f, animationSpec = spec)
            }

            progressAnim.snapTo(0f)
        } else if (finalTarget < current && current >= 1f) {
            // Fallback: handle unexpected rollover without a level delta
            progressAnim.animateTo(1f, animationSpec = spec)
            progressAnim.snapTo(0f)
        }

        progressAnim.animateTo(finalTarget, animationSpec = spec)
        prevLevel = user.level
    }

    Surface(
        tonalElevation = 4.dp,
        modifier = Modifier
            .width(200.dp)
            .fillMaxHeight()
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(contentAlignment = Alignment.Center) {
                        CircleUserIcon(
                            imageResource = null,
                            borderWidth = 2.dp,
                            size = 48.dp,
                            modifier = Modifier.padding(8.dp)
                                .clip(CircleShape)
                                .clickable {

                                }
                        )
                        // Progress bar for exp to level up
                        CircularProgressIndicator(
                            progress = { progressAnim.value },
                            modifier = Modifier.size(60.dp),
                            strokeWidth = 5.dp,
                            gapSize = 0.dp,
                            strokeCap = StrokeCap.Butt,
                            color = MaterialTheme.colorScheme.primary,
                            trackColor = MaterialTheme.colorScheme.background
                        )
                    }
                    Text(
                        text = "${user.currentExp} / ${user.lvlUpThreshold}",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Text(
                    text = "Level ${user.level}",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
            TextButton(
                shape = RoundedCornerShape(4.dp),
                onClick = {
                    screen.value = if (screen.value == 0) {
                        1
                    } else {
                        0
                    }
                }
            ) {
                Text("Achievements", fontWeight = FontWeight.Bold)
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Chores:",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp, start = 16.dp)
            )
            Spacer(
                Modifier
                    .background(color = MaterialTheme.colorScheme.primary, shape = RectangleShape)
                    .fillMaxWidth()
                    .size(2.dp)
            )
            AddChorePopup(
                onDismiss = {
                    addChorePopup = false
                },
                date = CalendarHelper.today(),
                addChore = { chore -> viewModel.addChore(chore) },
                visible = addChorePopup
            )
            TextButton(
                shape = RoundedCornerShape(4.dp),
                onClick = {
                    addChorePopup = true
                }
            ) {
                Text("Add Chore", fontWeight = FontWeight.Bold)
            }
            LazyColumn {
                items(chores) { chore ->
                    ChoreItem(chore = chore, onSelect = {
                        viewModel.enableDisableChore(chore)
                    }, modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun ChoreItem(chore: Chore, onSelect: (chore: Chore) -> Unit, modifier: Modifier = Modifier) {
    var selected by remember { mutableStateOf(true) }
    Surface(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.padding(horizontal = 4.dp)
            .fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = selected,
                onCheckedChange = {
                    onSelect(chore)
                    selected = !selected
                },
                modifier = Modifier.size(30.dp),
                colors = CheckboxDefaults.colors(
                    checkedColor = chore.color,
                    uncheckedColor = chore.color
                )
            )
            Spacer(Modifier.width(4.dp))
            Text(
                text = chore.title,
                modifier = modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }
    }

}