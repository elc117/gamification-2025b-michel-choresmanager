package com.altmann.choresmanager.ui.screens.calendar.monthcalendar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.calendar.CalendarEvent
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.AddChorePopup
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupViewModel
import com.altmann.choresmanager.ui.screens.chore.viewchorepopup.ViewChorePopup
import com.altmann.choresmanager.utils.ColorHelper.readableOn
import kotlinx.datetime.LocalDate
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun DayCell(
    date: LocalDate = LocalDate(2024, 1, 1),
    occurences: List<Chore> = listOf(),
    selected: Boolean = false,
    expanded: Boolean = false,
    faded: Boolean,
    onClick: () -> Unit = {},
    onDismiss: () -> Unit = {},
    addChore: (chore: Chore) -> Unit = {},
    send: (CalendarEvent) -> Unit = {},
    modifier: Modifier = Modifier
) {
    val bg = when {
        selected -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
        else -> MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
    }
    val border = if (selected) MaterialTheme.colorScheme.primary else Color.Transparent
    val textColor = if (faded) Color.Gray else MaterialTheme.colorScheme.onSurface
    val elevation = if (selected) 2.dp else 0.dp
    val fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
    var isChoreExpanded by remember {
        mutableStateOf(false)
    }
    var expandedChore: Chore? by remember {
        mutableStateOf(null)
    }

    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(onClick = onClick),
        tonalElevation = elevation,
        color = bg,
        border = BorderStroke(1.dp, border)
    ) {
        Box(
            Modifier.fillMaxSize()
                .padding(6.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = date.day.toString(),
                    style = MaterialTheme.typography.bodyLarge,
                    color = textColor,
                    fontWeight = fontWeight
                )
                if (occurences.isNotEmpty()) {
                    LazyColumn {
                        items(occurences) { occ ->
                            var modifierBox = Modifier
                                .background(
                                    occ.color,
                                    RoundedCornerShape(8.dp),
                                )
                                .clip(RoundedCornerShape(8.dp))
                            // If selected chore is clickable, to prevent accidental clicks when trying to focus on day
                            modifierBox = if (selected) {
                                modifierBox
                                    .clickable(true) {
                                        expandedChore = occ
                                        isChoreExpanded = true
                                    }
                            } else {
                                modifierBox
                            }
                            Box(
                                modifier = modifierBox
                            ) {
                                Text(
                                    text = occ.title,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = readableOn(occ.color),
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }
                }
            }
            if (expandedChore != null) {
                ViewChorePopup(
                    onDismiss = {
                        isChoreExpanded = false
                    },
                    date = date,
                    visible = isChoreExpanded,
                    chore = expandedChore!!,
                    onFinish = { choreId, date ->
                        send(CalendarEvent.MarkFinished(choreId = choreId, date = date))
                    },
                    onGroceriesUpdated = { chore ->
                        send(
                            CalendarEvent.UpdateChore(chore = chore)
                        )
                    },
                    onWorkoutChanged = { chore ->
                        send(
                            CalendarEvent.UpdateChore(chore = chore)
                        )
                    }
                )
            }
            val viewModel = koinViewModel<ChorePopupViewModel>()
            AddChorePopup(
                onDismiss = onDismiss,
                date = date,
                addChore = {
                    addChore(it)
                },
                visible = selected && expanded,
                viewModel = viewModel
            )

        }
    }

}