package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.datetime.DayOfWeek

@Composable
fun DayOfWeekPicker(onSelect: (DayOfWeek) -> Unit, selectedDays: List<DayOfWeek>) {
    val startingSunday = listOf(
        DayOfWeek.SUNDAY,
        DayOfWeek.MONDAY,
        DayOfWeek.TUESDAY,
        DayOfWeek.WEDNESDAY,
        DayOfWeek.THURSDAY,
        DayOfWeek.FRIDAY,
        DayOfWeek.SATURDAY
    )
    Surface {
        Row(modifier = Modifier.fillMaxWidth().padding(4.dp)) {
            startingSunday.forEach { day ->
                Box(Modifier.weight(1f)) {
                    DayOfWeekItem(day, selectedDays.contains(day), onSelect = onSelect)
                }
            }
        }
    }
}



@Composable
fun DayOfWeekItem(day: DayOfWeek, selected: Boolean, onSelect: (DayOfWeek) -> Unit) {
    val bg =
        if (selected) MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
        else MaterialTheme.colorScheme.surfaceVariant.copy(
            alpha = 0.4f
        )
    val border =
        if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurfaceVariant
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = bg,
        border = BorderStroke(1.dp, border),
        modifier = Modifier
            .padding(4.dp)
            .clickable { onSelect(day) }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().aspectRatio(1f)
        ) {
            Text(
                text = day.name.take(1),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }

}
