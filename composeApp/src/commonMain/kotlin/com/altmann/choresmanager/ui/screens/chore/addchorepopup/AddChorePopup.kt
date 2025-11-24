package com.altmann.choresmanager.ui.screens.chore.addchorepopup

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.Priority
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.chores.grocery.GroceryChore
import com.altmann.choresmanager.models.chores.gym.GymChore
import com.altmann.choresmanager.ui.screens.chore.grocerychore.GroceryChoreFields
import com.altmann.choresmanager.ui.screens.chore.gymchore.GymChoreFields
import com.altmann.choresmanager.ui.screens.components.fields.DateTextField
import com.altmann.choresmanager.ui.screens.components.fields.TimeTextField
import com.altmann.choresmanager.ui.screens.components.pickers.ChoreTypePicker
import com.altmann.choresmanager.ui.screens.components.pickers.ColorPicker
import com.altmann.choresmanager.ui.screens.components.pickers.DayOfWeekPicker
import com.altmann.choresmanager.ui.screens.components.pickers.PriorityPicker
import com.altmann.choresmanager.utils.DateTimeParser
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Composable
fun AddChorePopup(
    onDismiss: () -> Unit,
    date: LocalDate,
    addChore: (chore: Chore) -> Unit,
    startTime : LocalTime? = null,
    visible: Boolean,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    viewModel: ChorePopupViewModel
) {
    val state by viewModel.state.collectAsState()
    viewModel.setSelectedDay(date)
    DropdownMenu(
        expanded = visible,
        onDismissRequest = { onDismiss() },
        offset = offset,
        modifier = Modifier.width(300.dp).padding(horizontal = 8.dp),
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        PopUpContent(
            date = date,
            state = state,
            prevStartTime = startTime,
            onEvent = viewModel::onEvent,
            onAddChore = addChore,
            onDismiss = onDismiss
        )
    }
}

@OptIn(ExperimentalComposeUiApi::class, ExperimentalUuidApi::class)
@Composable
fun PopUpContent(
    date: LocalDate,
    state: ChorePopupState,
    prevStartTime: LocalTime?,
    onEvent: (ChorePopupEvent) -> Unit,
    onAddChore: (chore: Chore) -> Unit,
    onDismiss: () -> Unit
) {
    val startDate = remember { mutableStateOf(date) }
    val endDate = remember { mutableStateOf(LocalDate(2024, 6, 1)) }
    val startTime = remember { mutableStateOf(prevStartTime?: LocalTime(12, 0)) }
    val endTime = remember { mutableStateOf(LocalTime(14, 0)) }

    val startDateTxt =
        remember { mutableStateOf(TextFieldValue(DateTimeParser.parseDateToText(date))) }
    val endDateTxt = remember { mutableStateOf(TextFieldValue("")) }
    val startTimeTxt = remember { mutableStateOf(TextFieldValue(if (prevStartTime != null) DateTimeParser.parseTimeToText(prevStartTime) else "")) }
    val endTimeTxt = remember { mutableStateOf(TextFieldValue("")) }



    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Add Chore",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(8.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            ChoreTypePicker(
                selectedChore = state.selectedChoreType,
                onChoreSelected = { onEvent(ChorePopupEvent.ChoreTypeChanged(it)) },
                modifier = Modifier.padding(8.dp)
            )
        }

        TextField(
            value = state.title,
            onValueChange = { onEvent(ChorePopupEvent.TitleChanged(it)) },
            maxLines = 1,
            label = { Text("Chore Title") },
        )

        FieldSpacer()

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            DateTextField(
                dateTxt = startDateTxt,
                date = startDate,
                label = "Start date",
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(4.dp))
            DateTextField(
                dateTxt = endDateTxt,
                date = endDate,
                label = "End date",
                modifier = Modifier.weight(1f)
            )
        }
        FieldSpacer()
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            TimeTextField(
                timeTxt = startTimeTxt,
                time = startTime,
                label = "Start Time",
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(4.dp))

            TimeTextField(
                timeTxt = endTimeTxt,
                time = endTime,
                label = "End Time",
                modifier = Modifier.weight(1f)
            )
        }

        FieldSpacer()

        when (state.selectedChoreType) {
            "Default" -> {}
            "College" -> CollegeChoreFields(onEvent, state)
            "Grocery" -> GroceryChoreFields(onEvent, state)
            "Gym" -> GymChoreFields(onEvent, state)
        }

        Text(
            "Days of Week",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(start = 8.dp)
        )

        DayOfWeekPicker(
            onSelect = { day -> onEvent(ChorePopupEvent.DayToggled(day)) },
            selectedDays = state.selectedDays,
            clickable = true
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom
        ) {
            PriorityPicker(
                onPrioritySelected = { prio ->
                    onEvent(ChorePopupEvent.PriorityChanged(prio.name))
                },
                selectedPriority = Priority.valueOf(state.selectedPriority.uppercase())
            )

            Spacer(modifier = Modifier.weight(1f))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "Chore Color",
                    style = MaterialTheme.typography.bodySmall,
                )
                Button(
                    onClick = { onEvent(ChorePopupEvent.ToggleColorPicker) },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.width(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = state.selectedColor,
                        contentColor = Color.White,
                        disabledContentColor = Color.Gray,
                        disabledContainerColor = Color.LightGray
                    )
                ) {
                    Text("")
                }
            }

            DropdownMenu(
                expanded = state.isColorPickerOpen,
                onDismissRequest = { onEvent(ChorePopupEvent.ToggleColorPicker) },
                modifier = Modifier.padding(horizontal = 8.dp),
                offset = DpOffset(x = 100.dp, y = 0.dp),
                containerColor = MaterialTheme.colorScheme.background,
            ) {
                ColorPicker(
                    onColorSelected = { color -> onEvent(ChorePopupEvent.ColorChanged(color)) },
                    selectedColor = state.selectedColor
                )
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {
                    onEvent(ChorePopupEvent.Cancel)
                    onDismiss()
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                    contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                ),
                modifier = Modifier.clip(RoundedCornerShape(8.dp)).weight(1f)
            ) {
                Text("Cancel")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    var chore = Chore(
                        choreId = Uuid.random().toString(),
                        startTime = startTime.value,
                        endTime = endTime.value,
                        daysOfWeek = state.selectedDays,
                        startDate = startDate.value,
                        endDate = endDate.value,
                        choreException = listOf(),
                        title = state.title,
                        description = state.description.ifBlank { "" },
                        priority = Priority.valueOf(state.selectedPriority.uppercase()),
                        color = state.selectedColor
                    )

                    when (state.selectedChoreType) {
                        "Grocery" -> {
                            chore = GroceryChore(
                                chore = chore,
                                items = state.items
                            )
                        }

                        "College" -> {
                            chore = CollegeChore(
                                chore = chore,
                                subject = state.subject,
                                location = state.location,
                                professor = state.professor,
                                totalHours = state.totalHours
                            )
                        }

                        "Gym" -> {
                            chore = GymChore(
                                chore = chore,
                                workout = state.workout,
                                exerciseDay = state.exerciseDay
                            )
                        }
                    }

                    onEvent(ChorePopupEvent.AddChore)
                    onAddChore(chore)
                    onDismiss()
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.clip(RoundedCornerShape(8.dp)).weight(1f)
            ) {
                Text("Add Chore")
            }
        }
    }
}

@Composable
fun CollegeChoreFields(onEvent: (ChorePopupEvent) -> Unit, state: ChorePopupState) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = state.subject,
                onValueChange = { subject -> onEvent(ChorePopupEvent.SubjectChanged(subject)) },
                maxLines = 1,
                modifier = Modifier.weight(1f),
                label = { Text("Subject") },
            )
            Spacer(modifier = Modifier.width(4.dp))
            TextField(
                value = state.location,
                onValueChange = { location -> onEvent(ChorePopupEvent.LocationChanged(location)) },
                maxLines = 1,
                modifier = Modifier.weight(1f),
                label = { Text("Location") },
            )
        }
        FieldSpacer()
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = state.professor,
                onValueChange = { subject -> onEvent(ChorePopupEvent.ProfessorChanged(subject)) },
                maxLines = 1,
                modifier = Modifier.weight(1f),
                label = { Text("Professor") },
            )
            Spacer(modifier = Modifier.width(4.dp))
            TextField(
                value = state.totalHoursTxt,
                onValueChange = { onEvent(ChorePopupEvent.TotalHoursChanged(it)) },
                maxLines = 1,
                modifier = Modifier.weight(1f),
                label = { Text("Total hours") },
            )
        }
    }
}


@Composable
fun FieldSpacer() {
    Spacer(modifier = Modifier.height(8.dp))
}