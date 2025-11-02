package com.altmann.choresmanager.ui.screens.calendar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.minus
import kotlinx.datetime.plus

@Composable
fun CalendarScreen(
    viewModel: CalendarViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    // Selected month (anchor on first day)
    val anchor by viewModel.anchor.collectAsState()
    val selectedDate by viewModel.selectedDate.collectAsState()
    val (start, end) = remember(anchor) { CalendarHelper.monthGridWindow(anchor) }

    // used for debbuging
    print("\n ${anchor}")

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        MonthHeader(
            anchor = anchor,
            onPrev = viewModel::onPrev,
            onNext = viewModel::onNext
        )
        Spacer(modifier = Modifier.height(8.dp))
        WeekdayRow()
        Spacer(modifier = Modifier.height(4.dp))
        MonthGrid(
            start = start,
            occurencesByDate = mapOf(Pair(anchor, listOf("Work", "College"))),
            selectedDate = selectedDate,
            onSelect = {viewModel.onSelectDate(it)},
            // Days outside the current month get colored grey
            inAnchorMonth = {it.month.ordinal == anchor.month.ordinal && it.year == anchor.year}
        )
    }
}

@Composable
private fun MonthHeader(anchor: LocalDate, onPrev: () -> Unit, onNext: () -> Unit) {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        TextButton(onClick = onPrev) { Text("◀") }
        Spacer(Modifier.width(8.dp))
        Text(
            text = "${anchor.month.name} - ${anchor.year}",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.weight(1f)
        )
        Spacer(Modifier.width(8.dp))
        TextButton(onClick = onNext) { Text("▶") }
    }
}

@Composable
private fun WeekdayRow() {
    val labels = listOf("Sun", "Mon", "Tue", "Weg", "Thu", "Fri", "Sat")
    Row(Modifier.fillMaxWidth()) {
        labels.forEach { label ->
            Box(
                Modifier.weight(1f).padding(vertical = 6.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(label, style = MaterialTheme.typography.titleLarge, color = Color.Gray)
            }
        }
    }
}

@Composable
private fun MonthGrid(
    start: LocalDate,
    occurencesByDate: Map<LocalDate, List<String>>, // maps day to chore
    selectedDate: LocalDate,
    onSelect: (LocalDate) -> Unit,
    inAnchorMonth: (LocalDate) -> Boolean
) {
    // 6x7 = 42
    val days: List<LocalDate> =
        remember(start) { (0 until 42).map { start.plus(DatePeriod(days = it)) } }

    Column(Modifier.fillMaxWidth()) {
        for (row in 0 until 6) {
            Row(Modifier.fillMaxWidth()) {
                for (col in 0 until 7) {
                    val date = days[row * 7 + col]
                    val occ = occurencesByDate[date].orEmpty()
                    DayCell(
                        date = date,
                        occurences = occ,
                        selected = date == selectedDate,
                        faded = !inAnchorMonth(date),
                        onClick = {onSelect(date)},
                        modifier = Modifier.weight(1f).aspectRatio(1f).padding(4.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun DayCell(
    date: LocalDate,
    occurences: List<String>,
    selected: Boolean,
    faded: Boolean,
    onClick: () -> Unit,
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
        modifier = modifier.clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        tonalElevation = elevation,
        color = bg,
        border = BorderStroke(1.dp, border)
    ) {
        Box(Modifier.fillMaxSize().padding(6.dp)) {
            Text(
                text = date.dayOfMonth.toString(),
                style = MaterialTheme.typography.bodyLarge,
                color = textColor,
                modifier = Modifier.align(Alignment.TopCenter),
                fontWeight = fontWeight
            )
            if (occurences.isNotEmpty()) {
                Box(
                    modifier = Modifier.align(Alignment.BottomEnd)
                        .background(MaterialTheme.colorScheme.secondary, RoundedCornerShape(12.dp))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = occurences.size.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.onSecondary
                    )
                }
            }
        }
    }
}