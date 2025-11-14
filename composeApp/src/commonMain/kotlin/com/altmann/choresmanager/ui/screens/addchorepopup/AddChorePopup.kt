package com.altmann.choresmanager.ui.screens.addchorepopup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Priority
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.components.fields.DateTextField
import com.altmann.choresmanager.ui.screens.components.fields.TimeTextField
import com.altmann.choresmanager.ui.screens.components.pickers.DayOfWeekPicker
import com.altmann.choresmanager.ui.screens.components.pickers.PriorityPicker
import com.altmann.choresmanager.utils.DateTimeParser
import com.kborowy.colorpicker.KolorPicker
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Composable
fun AddChorePopup(
    onDismiss: () -> Unit,
    date: LocalDate,
    addChore: (chore: Chore) -> Unit,
    visible: Boolean
) {

    DropdownMenu(
        expanded = visible,
        onDismissRequest = { onDismiss() },
        modifier = Modifier.width(300.dp).padding(horizontal = 8.dp),
        containerColor = MaterialTheme.colorScheme.background,
        border = BorderStroke(0.5.dp, MaterialTheme.colorScheme.primary),
    )
    {
        PopUpContent(
            date = date,
            addChore = addChore,
        )
    }
}

@OptIn(ExperimentalComposeUiApi::class, ExperimentalUuidApi::class)
@Composable
fun PopUpContent(
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
    val selectedColor = remember { mutableStateOf(Color.Gray) }

    var openColorSelection by remember { mutableStateOf(false) }

    val startDate = remember { mutableStateOf(date) }
    val endDate = remember { mutableStateOf(LocalDate(2024, 6, 1)) }
    val startTime = remember { mutableStateOf(LocalTime(12, 0)) }
    val endTime = remember { mutableStateOf(LocalTime(14, 0)) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = title.value,
            onValueChange = { title.value = it },
            maxLines = 1,
            label = { Text("Chore Title") },
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
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom
        ) {
            PriorityPicker(
                onPrioritySelected = { selectedPriority.value = it },
                selectedPriority = selectedPriority.value
            )
            Spacer(modifier = Modifier.weight(1f))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "Chore Color",
                    style = MaterialTheme.typography.bodySmall,
                )
                Button(
                    onClick = {
                        openColorSelection = !openColorSelection
                    },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.width(100.dp),
                    colors = ButtonColors(
                        containerColor = selectedColor.value,
                        contentColor = Color.White,
                        disabledContentColor = Color.Gray,
                        disabledContainerColor = Color.LightGray
                    )
                ) {
                    Text("")
                }
            }
            DropdownMenu(
                expanded = openColorSelection,
                onDismissRequest = { openColorSelection = false },
                modifier = Modifier.padding(horizontal = 8.dp),
                containerColor = MaterialTheme.colorScheme.background,
            ) {
                KolorPicker(
                    onColorSelected = {selectedColor.value = it},
                    modifier = Modifier.width(250.dp).height(200.dp),
                    initialColor = selectedColor.value
                )
            }
        }
        Button(
            onClick = {
                addChore(
                    Chore(
                        choreId = Uuid.random().toString(),
                        startTime = startTime.value,
                        endTime = endTime.value,
                        daysOfWeek = selectedDays,
                        startDate = startDate.value,
                        endDate = endDate.value,
                        choreException = listOf(),
                        title = title.value,
                        description = "Treinão de perna",
                        priority = selectedPriority.value,
                        color = selectedColor.value
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


@Composable
fun FieldSpacer() {
    Spacer(modifier = Modifier.height(8.dp))
}