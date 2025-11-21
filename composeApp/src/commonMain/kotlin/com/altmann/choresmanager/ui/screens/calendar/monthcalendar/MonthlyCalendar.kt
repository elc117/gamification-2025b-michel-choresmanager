package com.altmann.choresmanager.ui.screens.calendar.monthcalendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.calendar.CalendarEvent
import com.altmann.choresmanager.ui.screens.calendar.CalendarUiState
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

@Composable
fun MonthlyCalendar(
    calendarVM: CalendarViewModel
) {
    val uiState by calendarVM.state.collectAsState()
    val send = calendarVM::onEvent
    val anchor = uiState.anchor

    LaunchedEffect(anchor, uiState.enabledChores) {
        send(CalendarEvent.LoadChores)
    }
    BoxWithConstraints {
        val maxWidth = this.maxWidth
        val maxHeight = this.maxHeight
        var dayCellWidth = (maxWidth / 7) - 8.dp
        val dayCellHeight = ((maxHeight) / 6) - 12.dp

        Column(
            Modifier
                .width(maxWidth)
                .height(maxHeight)
                .background(MaterialTheme.colorScheme.background)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WeekdayRow(
                modifier = Modifier.width(dayCellWidth * 7 + 48.dp).height(dayCellHeight / 3)
            )
            Spacer(modifier = Modifier.height(4.dp))
            MonthGrid(
                uiState = uiState,
                send = send,
                // Days outside the current month get colored grey
                inAnchorMonth = { it.month.ordinal == anchor.month.ordinal && it.year == anchor.year },
                modifier = Modifier.width(dayCellWidth * 7 + 48.dp),
                dayCellHeight = dayCellHeight
            )
        }
    }
}

@Composable
private fun WeekdayRow(modifier: Modifier) {
    val labels = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    Row(modifier) {
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
    inAnchorMonth: (LocalDate) -> Boolean,
    modifier: Modifier,
    dayCellHeight: Dp
) {
    // 6x7 = 42
    val (start, _) = remember(uiState.anchor) {
        CalendarHelper.monthGridWindow(uiState.anchor)
    }
    val days: List<LocalDate> =
        remember(start) { (0 until 42).map { start.plus(DatePeriod(days = it)) } }

    Column(modifier) {
        for (row in 0 until 6) {
            Row(Modifier.fillMaxWidth()) {
                for (col in 0 until 7) {
                    val date = days[row * 7 + col]
                    val occ = uiState.choresByDate[date].orEmpty()
                    DayCell(
                        date = date,
                        occurences = occ,
                        selected = date == uiState.selectedDate,
                        expanded = uiState.expandedAddChore,
                        faded = !inAnchorMonth(date),
                        onClick = {
                            send(CalendarEvent.SelectDate(date))
                        },
                        onDismiss = { send(CalendarEvent.DismissExpanded) },
                        addChore = {
                            send(CalendarEvent.AddChore(it))
                        },
                        send = send,
                        modifier = Modifier.weight(1f).height(dayCellHeight).padding(4.dp)
                    )
                }
            }
        }
    }
}

