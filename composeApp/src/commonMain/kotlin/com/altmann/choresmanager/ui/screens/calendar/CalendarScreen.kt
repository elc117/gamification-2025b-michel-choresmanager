package com.altmann.choresmanager.ui.screens.calendar

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

@Composable
fun CalendarScreen(
    calendarVM: CalendarViewModel
) {
    val uiState by calendarVM.state.collectAsState()
    val send = calendarVM::onEvent
    val anchor = uiState.anchor

    LaunchedEffect(anchor, uiState.enabledChores) {
        send(CalendarEvent.LoadChores)
    }

    Column(
        Modifier.fillMaxSize()
            .padding(16.dp)
            .aspectRatio(1f, true)
    ) {
        MonthHeader(
            anchor = anchor,
            onPrev = { send(CalendarEvent.PrevMonth) }, // fixed mapping
            onNext = { send(CalendarEvent.NextMonth) }
        )
        Spacer(modifier = Modifier.height(8.dp))
        WeekdayRow()
        Spacer(modifier = Modifier.height(4.dp))
        MonthGrid(
            uiState = uiState,
            send = send,
            // Days outside the current month get colored grey
            inAnchorMonth = { it.month.ordinal == anchor.month.ordinal && it.year == anchor.year }
        )
    }
}

@Composable
private fun MonthHeader(anchor: LocalDate, onPrev: () -> Unit, onNext: () -> Unit) {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        TextButton(onClick = onPrev) { Text("<") }
        Spacer(Modifier.width(8.dp))
        Text(
            text = "${anchor.month.name} - ${anchor.year}",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.weight(1f)
        )
        Spacer(Modifier.width(8.dp))
        TextButton(onClick = onNext) { Text(">") }
    }
}

@Composable
private fun WeekdayRow() {
    val labels = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
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
    uiState: CalendarUiState,
    send: (CalendarEvent) -> Unit,
    inAnchorMonth: (LocalDate) -> Boolean
) {
    // 6x7 = 42
    val (start, _) = remember(uiState.anchor) {
        CalendarHelper.monthGridWindow(uiState.anchor)
    }
    val days: List<LocalDate> =
        remember(start) { (0 until 42).map { start.plus(DatePeriod(days = it)) } }

    Column(Modifier.fillMaxWidth()) {
        for (row in 0 until 6) {
            Row(Modifier.fillMaxWidth()) {
                for (col in 0 until 7) {
                    val date = days[row * 7 + col]
                    val occ = uiState.choresByDate[date].orEmpty()
                    DayCell(
                        date = date,
                        occurences = occ,
                        selected = date == uiState.selectedDate,
                        expanded = uiState.expanded,
                        faded = !inAnchorMonth(date),
                        onClick = { send(CalendarEvent.SelectDate(date)) },
                        onDismiss = { send(CalendarEvent.DismissExpanded) },
                        addChore ={ send(CalendarEvent.AddChore(it)) },
                        send = send,
                        modifier = Modifier.weight(1f).aspectRatio(1f, true).padding(4.dp)
                    )
                }
            }
        }
    }
}
