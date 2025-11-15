package com.altmann.choresmanager.ui.screens.components.pickers

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Priority

@Composable
fun ChoreTypePicker(
    selectedChore: String = "Default",
    onChoreSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val chores = listOf("Default", "College", "Grocery", "Gym")
    Box {
        TextButton(
            onClick = {
                expanded = !expanded
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.clip(RoundedCornerShape(8.dp))
        ) {
            Text("ChoreType: $selectedChore", fontWeight = FontWeight.Bold)
        }
        DropdownMenu(
            onDismissRequest = { expanded = !expanded },
            expanded = expanded,
        ) {
            chores.forEach { chore ->
                ChoreItem(
                    chore = chore,
                    isSelected = chore == selectedChore,
                    onChoreSelected = {
                        onChoreSelected(it)
                        expanded = false
                    },
                    modifier = Modifier.padding(horizontal = 4.dp)
                )
            }
        }
    }
}

@Composable
fun ChoreItem(
    chore: String,
    isSelected: Boolean,
    onChoreSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = { onChoreSelected(chore) },
        modifier = modifier,
        colors = ButtonDefaults.textButtonColors(
            contentColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = chore,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
            )
        }

    }
}