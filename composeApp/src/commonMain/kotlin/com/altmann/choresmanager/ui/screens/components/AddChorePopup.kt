package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.utils.TimerParser
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlinx.datetime.plus

@Composable
fun AddChorePopup(
    onDismiss: () -> Unit,
    datePicked: MutableState<String>,
    date: LocalDate,
    addChore: (chore: Chore) -> Unit
) {
    val popupOffset = remember { mutableStateOf(0) }

    Popup(
        alignment = Alignment.BottomCenter,
        onDismissRequest = { onDismiss() },
        offset = IntOffset(0, y = +popupOffset.value + 4),
        properties = PopupProperties(focusable = true),
    )
    {
        PopUpContent(
            popupOffset = popupOffset,
            datePicked = datePicked,
            date = date,
            addChore = addChore,
        )
    }
}

@Composable
fun PopUpContent(
    popupOffset: MutableState<Int>,
    datePicked: MutableState<String>,
    date: LocalDate,
    addChore: (chore: Chore) -> Unit,
) {
    val title = remember { mutableStateOf("") }
    val startTimeTxt = remember { mutableStateOf(TextFieldValue("")) }
    val endTimeTxt = remember { mutableStateOf(TextFieldValue("")) }
    var selectedDays by remember { mutableStateOf<List<DayOfWeek>>(emptyList()) }

    val startTime = remember {mutableStateOf(LocalTime(12, 0))}
    val endTime = remember {mutableStateOf(LocalTime(14, 0))}
    Surface(
        shape = RoundedCornerShape(8.dp),
        tonalElevation = 4.dp,
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier.onPlaced { popupOffset.value = it.size.height }
            .width(300.dp)
    ) {
        Column {
            TextField(
                value = title.value,
                onValueChange = { title.value = it },
                maxLines = 1,
                label = { Text("Chore Title") },
                modifier = Modifier.padding(8.dp)
            )
            FieldSpacer()
            TextField(
                value = datePicked.value,
                onValueChange = { datePicked.value = it },
                maxLines = 1,
                label = { Text("Due Date") },
                modifier = Modifier.padding(8.dp),
            )
            FieldSpacer()
            TimeTextField(
                timeTxt = startTimeTxt,
                time = startTime,
                label = "Start Time",
                modifier = Modifier
            )
            FieldSpacer()
            TimeTextField(
                timeTxt = endTimeTxt,
                time = endTime,
                label = "End Time",
                modifier = Modifier
            )
            Text(
                "Days of Week",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 8.dp)
            )
            DayOfWeekPicker(
                onSelect = { day ->
                    selectedDays = if (selectedDays.contains(day)) {
                        selectedDays - day
                    } else {
                        selectedDays + day
                    }
                }, selectedDays = selectedDays
            )
            Button(
                onClick = {
                    addChore(
                        Chore(
                            choreId = 1,
                            startTime = startTime.value,
                            endTime = endTime.value,
                            daysOfWeek = selectedDays,
                            startDate = date,
                            endDate = date + DatePeriod(days = 30),
                            choreException = listOf(),
                            title = title.value,
                            description = "Treinão de perna",
                            priority = Priority.NORMAL,
                            finishedDate = LocalDate(2024, 6, 1),
                            userId = 1,
                        )
                    )
                    print(date.toString() + "\n")
                    print(LocalDate(2025, 6, 26).toString())
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("Add Chore")
            }
        }
    }
}

@Composable
fun FieldSpacer() {
    Spacer(modifier = Modifier.height(4.dp))
}