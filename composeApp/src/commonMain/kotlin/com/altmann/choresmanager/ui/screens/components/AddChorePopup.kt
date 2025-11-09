package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.altmann.choresmanager.models.Priority
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.utils.DateTimeParser
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

@Composable
fun AddChorePopup(
    onDismiss: () -> Unit,
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
            date = date,
            addChore = addChore,
        )
    }
}

@Composable
fun PopUpContent(
    popupOffset: MutableState<Int>,
    date: LocalDate,
    addChore: (chore: Chore) -> Unit,
) {
    val title = remember { mutableStateOf("") }
    val startDateTxt =
        remember { mutableStateOf(TextFieldValue(DateTimeParser.parseDateToText(date))) }
    val endDateTxt = remember { mutableStateOf(TextFieldValue("")) }
    val startTimeTxt = remember { mutableStateOf(TextFieldValue("")) }
    val endTimeTxt = remember { mutableStateOf(TextFieldValue("")) }
    var selectedDays by remember { mutableStateOf<List<DayOfWeek>>(emptyList()) }
    val selectedPriority = remember { mutableStateOf(Priority.NORMAL) }

    val startDate = remember { mutableStateOf(date) }
    val endDate = remember { mutableStateOf(LocalDate(2024, 6, 1)) }
    val startTime = remember { mutableStateOf(LocalTime(12, 0)) }
    val endTime = remember { mutableStateOf(LocalTime(14, 0)) }
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
            DateTextField(
                dateTxt = startDateTxt,
                date = startDate,
                label = "Start date",
                modifier = Modifier
            )
            FieldSpacer()
            DateTextField(
                dateTxt = endDateTxt,
                date = endDate,
                label = "End date",
                modifier = Modifier
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
            FieldSpacer()
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
            FieldSpacer()

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                PriorityPicker(
                    onPrioritySelected = { selectedPriority.value = it },
                    selectedPriority = selectedPriority.value
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = {
                        addChore(
                            Chore(
                                choreId = 1,
                                startTime = startTime.value,
                                endTime = endTime.value,
                                daysOfWeek = selectedDays,
                                startDate = date,
                                endDate = endDate.value,
                                choreException = listOf(),
                                title = title.value,
                                description = "Treinão de perna",
                                priority = selectedPriority.value,
                                finishedDate = null
                            )
                        )
                        print(date.toString() + "\n")
                    },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.clip(RoundedCornerShape(8.dp))
                ) {
                    Text("Add Chore")
                }
            }
        }
    }
}

@Composable
fun FieldSpacer() {
    Spacer(modifier = Modifier.height(4.dp))
}