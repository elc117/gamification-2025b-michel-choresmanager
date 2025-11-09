package com.altmann.choresmanager.ui.screens.calendar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fitInside
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
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
import androidx.compose.ui.layout.LayoutBoundsHolder
import androidx.compose.ui.layout.layoutBounds
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.components.DayCell
import com.altmann.choresmanager.utils.CalendarHelper
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus

@Composable
fun CalendarScreen(
    viewModel: CalendarViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    // Selected month (anchor on first day)
    val anchor by viewModel.anchor.collectAsState()
    val selectedDate by viewModel.selectedDate.collectAsState()
    val expanded by viewModel.expandedDay.collectAsState()
    val (start, end) = remember(anchor) { CalendarHelper.monthGridWindow(anchor) }
    val chores by viewModel.mappedChores.collectAsState()

    LaunchedEffect(anchor) {
        viewModel.loadingChores()
    }
    // used for debbuging
    print("\n ${anchor}")



    Column(
        Modifier.fillMaxSize()
            .padding(16.dp)
            .aspectRatio(1f, true)
    ) {
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
            occurencesByDate = chores,
            selectedDate = selectedDate,
            expanded = expanded,
            onSelect = { viewModel.onSelectDate(it) },
            onDismiss = { viewModel.dismissExpandedDay() },
            addChore = {
                viewModel.addChore(it)
                viewModel.loadingChores()
            },
            // Days outside the current month get colored grey
            inAnchorMonth = { it.month.ordinal == anchor.month.ordinal && it.year == anchor.year }
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
    start: LocalDate,
    occurencesByDate: Map<LocalDate, List<Chore>>, // maps day to chore
    selectedDate: LocalDate,
    expanded: Boolean,
    onSelect: (LocalDate) -> Unit,
    onDismiss: () -> Unit,
    addChore: (chore: Chore) -> Unit,
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
                        expanded = expanded,
                        faded = !inAnchorMonth(date),
                        onClick = { onSelect(date) },
                        onDismiss = { onDismiss() },
                        addChore = addChore,
                        modifier = Modifier.weight(1f).aspectRatio(1f, true).padding(4.dp)
                    )
                }
            }
        }
    }
}
