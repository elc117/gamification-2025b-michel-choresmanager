package com.altmann.choresmanager.ui.screens.calendar

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.addchorepopup.AddChorePopup
import kotlinx.datetime.LocalDate

@Composable
fun DayCell(
    date: LocalDate,
    occurences: List<Chore>,
    selected: Boolean,
    expanded: Boolean,
    faded: Boolean,
    onClick: () -> Unit,
    onDismiss: () -> Unit,
    addChore: (chore: Chore) -> Unit,
    modifier: Modifier = Modifier
) {
    val bg = when {
        selected -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
        else -> MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
    }
    val border = if (selected) MaterialTheme.colorScheme.primary else Color.LightGray
    val textColor = if (faded) Color.Gray else MaterialTheme.colorScheme.onSurface
    val elevation = if (selected) 2.dp else 0.dp
    val fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium


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
                                        print(occ.title)
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
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }
                }

            }
            AddChorePopup(
                onDismiss = onDismiss,
                date = date,
                addChore = {
                    addChore(it)
                    onDismiss()
                },
                visible = selected && expanded
            )

        }
    }

}