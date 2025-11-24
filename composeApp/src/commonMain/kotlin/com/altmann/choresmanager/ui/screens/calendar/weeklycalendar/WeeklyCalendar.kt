package com.altmann.choresmanager.ui.screens.calendar.weeklycalendar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.calendar.CalendarEvent
import com.altmann.choresmanager.ui.screens.calendar.CalendarUiState
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.AddChorePopup
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupViewModel
import com.altmann.choresmanager.ui.screens.chore.viewchorepopup.ViewChorePopup
import com.altmann.choresmanager.utils.ColorHelper
import com.altmann.choresmanager.utils.DateTimeParser
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.plus
import org.koin.compose.viewmodel.koinViewModel

val SLOT = 15 // minutes
val SLOT_HEIGHT_DP = 16.dp // in dp
val SLOTS_PER_DAY = 24 * 60 / SLOT
val COLUMN_HEIGHT = SLOTS_PER_DAY * SLOT_HEIGHT_DP

@Composable
fun WeeklyCalendar(
    calendarVM: CalendarViewModel
) {
    val uiState by calendarVM.state.collectAsState()
    val send = calendarVM::onEvent
    val anchor = calendarVM.weekAnchor.collectAsState()

    val scrollState = rememberScrollState(0)
    LaunchedEffect(anchor, uiState.enabledChores) {
        send(CalendarEvent.LoadChores)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        WeekDayRow()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            TimeFrames(
                modifier = Modifier,
                scrollState = scrollState
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .verticalScroll(scrollState)
            ) {
                WeekList(
                    anchor = anchor.value,
                    state = uiState,
                    modifier = Modifier.padding(start = 0.dp, bottom = 8.dp, end = 8.dp),
                    send = send
                )
            }
            ScrollBar(scrollState)
        }
    }
}

@Composable
expect fun ScrollBar(scrollState: ScrollState)

@Composable
private fun TimeFrames(modifier: Modifier = Modifier, scrollState: ScrollState) {
    Box(modifier.height(COLUMN_HEIGHT + 16.dp).padding(top = 16.dp), contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.verticalScroll(scrollState)
        ) {
            for (hour in 0..23) {
                Text(
                    text = hour.toString().padStart(2, '0'),
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.height(SLOT_HEIGHT_DP * (60 / SLOT)).padding(start =4.dp)
                )
            }
        }
    }
}

@Composable
private fun WeekDayRow() {
    val days = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    Row(modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 16.dp)) {
        for (day in days) {
            Text(
                day,
                style = MaterialTheme.typography.titleLarge,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f).padding(2.dp)
            )
        }
    }
}

@Composable
private fun WeekList(
    anchor: LocalDate,
    state: CalendarUiState,
    send: (CalendarEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        for (i in 0..6) {
            val date = anchor.plus(DatePeriod(days = i))
            val dayChores = state.choresByDate[date].orEmpty()
            Spacer(modifier = Modifier.width(4.dp))
            WeekDayColumn(
                chores = dayChores,
                date = date,
                selected = date == state.selectedDate,
                onClick = {
                    send(CalendarEvent.SelectDate(it))
                },
                addChore = {
                    send(CalendarEvent.AddChore(it))
                },
                send = send,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun WeekDayColumn(
    chores: List<Chore>,
    date: LocalDate,
    selected: Boolean,
    addChore: (chore: Chore) -> Unit,
    onClick: (LocalDate) -> Unit,
    send: (CalendarEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    val bg = when {
        selected -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
        else -> MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
    }
    val border = if (selected) MaterialTheme.colorScheme.primary else Color.Transparent
    val textColor = MaterialTheme.colorScheme.onSurface
    if (selected) 2.dp else 0.dp
    val fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
    var expanded by remember(date) { mutableStateOf(false) }

    var isChoreExpanded by remember(date) {
        mutableStateOf(false)
    }
    var expandedChoreId by remember(date) {
        mutableStateOf<String?>(null)
    }

    val expandedChore = remember(chores, expandedChoreId) {
        chores.firstOrNull { it.choreId == expandedChoreId }
    }


    var clickedMinutes by remember(date) { mutableStateOf(0) }
    var clicked by remember(date) { mutableStateOf(1) }

    LaunchedEffect(selected, clicked) {
        if (selected) {
            expanded = (clicked == 2)
        } else {
            expanded = false
            clicked = 0
        }
    }

    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.clip(RoundedCornerShape(8.dp)).height(COLUMN_HEIGHT + 15.dp)
            .padding(2.dp),
        tonalElevation = 4.dp,
        color = bg,
        border = BorderStroke(1.dp, border)
    ) {
        Box(
            Modifier.height(COLUMN_HEIGHT + 15.dp)
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
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(COLUMN_HEIGHT)
                        .pointerInput(selected, date) {
                            detectTapGestures { offset ->
                                val density = this
                                val slotHeightPx = with(density) { SLOT_HEIGHT_DP.toPx() }
                                val totalMinutes = 24 * 60

                                val newClickedMinutes =
                                    ((offset.y / slotHeightPx) * SLOT).toInt()
                                        .coerceIn(0, totalMinutes - 1)
                                clickedMinutes = newClickedMinutes

                                onClick(date)
                                clicked = clicked + 1
                            }
                        },
                ) {
                    chores.forEach { chore ->
                        val startMinutes = chore.startTime.hour * 60 + chore.startTime.minute
                        val duration = chore.duration()

                        val startSlots = startMinutes / SLOT.toFloat()
                        val durationSlots = duration / SLOT.toFloat()

                        val yOffset = startSlots * SLOT_HEIGHT_DP.value
                        val height = durationSlots * SLOT_HEIGHT_DP.value
                        ChoreItem(
                            yOffset.toInt(),
                            height.toInt(),
                            chore,
                            onDismiss = {
                                isChoreExpanded = false
                            },
                            send = send,
                            date = date,
                            isChoreExpanded = isChoreExpanded && expandedChore == chore,
                            onClick = {
                                isChoreExpanded = true
                                expandedChoreId = chore.choreId
                            })
                    }
                }
            }
            val viewModel = koinViewModel<ChorePopupViewModel>()
            AddChorePopup(
                onDismiss = {
                    expanded = !expanded
                    clicked = 1
                },
                date = date,
                offset = DpOffset(x = 0.dp, y = clickedMinutes.dp),
                startTime = DateTimeParser.minutesToTime(clickedMinutes),
                addChore = {
                    addChore(it)
                },
                visible = selected && expanded,
                viewModel = viewModel
            )
        }
    }
}

@Composable
private fun ChoreItem(
    yOffset: Int,
    height: Int,
    chore: Chore,
    onClick: () -> Unit,
    onDismiss: () -> Unit,
    isChoreExpanded: Boolean,
    date: LocalDate,
    send: (CalendarEvent) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .offset(y = yOffset.dp)
            .height(height.dp)
            .padding(2.dp)
            .clip(RoundedCornerShape(4.dp))
            .clickable { onClick() },
        contentAlignment = Alignment.CenterStart
    ) {
        Surface(
            color = chore.color,
            modifier = Modifier.matchParentSize(),
            shape = RoundedCornerShape(4.dp),
            tonalElevation = 2.dp
        ) {
            Text(
                text = chore.title,
                style = MaterialTheme.typography.bodySmall,
                color = ColorHelper.readableOn(chore.color),
                modifier = Modifier.padding(4.dp)
            )
        }
        ViewChorePopup(
            onDismiss = {
                onDismiss()
            },
            date = date,
            visible = isChoreExpanded,
            chore = chore,
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

}
