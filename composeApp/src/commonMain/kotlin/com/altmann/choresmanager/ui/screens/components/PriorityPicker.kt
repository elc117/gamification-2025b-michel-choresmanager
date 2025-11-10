package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import com.altmann.choresmanager.models.Priority

@Composable
fun PriorityPicker(
    selectedPriority: Priority,
    onPrioritySelected: (Priority) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        TextButton(
            onClick = {
                expanded = !expanded
            },
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
            modifier = Modifier.clip(RoundedCornerShape(8.dp))
        ) {
            Text("Priority: ${selectedPriority.name}", fontWeight = FontWeight.Bold)
        }
        DropdownMenu(
            onDismissRequest = { expanded = !expanded },
            expanded = expanded
        ) {
            Priority.entries.forEach { priority ->
                PriorityItem(
                    priority = priority,
                    isSelected = priority == selectedPriority,
                    onPrioritySelected = {
                        onPrioritySelected(it)
                        expanded = false
                    },
                    modifier
                )
            }
        }
    }
}

@Composable
fun PriorityItem(
    priority: Priority,
    isSelected: Boolean,
    onPrioritySelected: (Priority) -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = { onPrioritySelected(priority) },
        modifier = modifier,
        colors = ButtonDefaults.textButtonColors(
            contentColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = priority.name,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
            )
        }

    }
}