package com.altmann.choresmanager.ui.screens.calendar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.calendar.monthcalendar.MonthlyCalendar
import com.altmann.choresmanager.ui.screens.calendar.weeklycalendar.WeeklyCalendar
import kotlinx.datetime.LocalDate

@Composable
fun CalendarScreen(
    calendarVM: CalendarViewModel
) {
    var monthly by remember { mutableStateOf(true) }
    val uiState by calendarVM.state.collectAsState()
    val send = calendarVM::onEvent

    val anchor = if (monthly) uiState.anchor else calendarVM.weekAnchor.collectAsState().value


    LaunchedEffect(anchor, uiState.enabledChores) {
        send(CalendarEvent.LoadChores)
    }

    Column(modifier = Modifier.fillMaxSize()) {
        MonthHeader(
            anchor = anchor,
            onPrev = {
                if (monthly) {
                    send(CalendarEvent.PrevMonth)
                } else send(CalendarEvent.PrevWeek)
            },
            onNext = {
                if (monthly) {
                    send(CalendarEvent.NextMonth)
                } else send(CalendarEvent.NextWeek)
            },
            onSwitch = {
                monthly = !monthly
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        when (monthly) {
            true -> MonthlyCalendar(calendarVM)
            false -> WeeklyCalendar(calendarVM)
        }
    }
}


@Composable
private fun MonthHeader(
    anchor: LocalDate,
    onPrev: () -> Unit,
    onNext: () -> Unit,
    onSwitch: () -> Unit,
    modifier: Modifier
) {
    Row(modifier, verticalAlignment = Alignment.CenterVertically) {
        TextButton(onClick = onPrev) { Text("<") }
        Spacer(Modifier.width(8.dp))
        Text(
            text = "${anchor.month.name} - ${anchor.year}",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.weight(1f)
        )
        Spacer(Modifier.width(8.dp))
        TextButton(onClick = onSwitch) { Text("↻") }
        TextButton(onClick = onNext) { Text(">") }
    }
}