package com.altmann.choresmanager.ui.screens.chore.viewchorepopup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.Priority
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.chores.grocery.GroceryChore
import com.altmann.choresmanager.models.chores.gym.GymChore
import com.altmann.choresmanager.ui.screens.chore.grocerychore.GroceryContent
import com.altmann.choresmanager.ui.screens.chore.gymchore.ExerciseItem
import com.altmann.choresmanager.ui.screens.components.pickers.DayOfWeekPicker
import com.altmann.choresmanager.utils.DateTimeParser
import kotlinx.datetime.LocalDate

@Composable
fun ViewChorePopup(
    onDismiss: () -> Unit,
    onFinish: (choreId: String, date: LocalDate) -> Unit,
    onGroceriesUpdated: (chore: Chore) -> Unit,
    onWorkoutChanged: (chore: Chore) -> Unit,
    date: LocalDate,
    chore: Chore,
    visible: Boolean,
) {
    DropdownMenu(
        expanded = visible,
        onDismissRequest = { onDismiss() },
        modifier = Modifier.width(300.dp).padding(horizontal = 8.dp),
        containerColor = MaterialTheme.colorScheme.background,
        border = BorderStroke(1.dp, chore.color),
    ) {
        ViewChorePopupContent(
            date = date,
            chore = chore,
            onDismiss = onDismiss,
            onFinish = onFinish,
            onGroceriesUpdated = onGroceriesUpdated,
            onWorkoutChanged = onWorkoutChanged
        )
    }
}

@Composable
private fun ViewChorePopupContent(
    date: LocalDate,
    chore: Chore,
    onDismiss: () -> Unit,
    onGroceriesUpdated: (chore: Chore) -> Unit,
    onWorkoutChanged: (chore: Chore) -> Unit,
    onFinish: (choreId: String, date: LocalDate) -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(4.dp)) {

        val style = MaterialTheme.typography.bodyMedium

        Text(
            text = chore.title,
            style = MaterialTheme.typography.titleMedium,
            fontSize = 24.sp,
            modifier = Modifier.padding(4.dp),
            textAlign = TextAlign.Center
        )
        if (chore.description.isNotEmpty()) {
            Text(
                text = "Description: ${chore.description}",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(4.dp).border(
                    width = 8.dp,
                    color = MaterialTheme.colorScheme.primary,
                    shape = RoundedCornerShape(8.dp)
                ).padding(8.dp),
            )
        }

        val dateText = if (chore.startDate == chore.endDate) {
            DateTimeParser.parseDateToText(chore.startDate)
        } else {
            "${DateTimeParser.parseDateToText(chore.startDate)} to ${
                DateTimeParser.parseDateToText(
                    chore.endDate
                )
            }"
        }

        Text(
            text = "Date: $dateText",
            style = style,
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )

        Text(
            text = "Time: ${DateTimeParser.parseTimeToText(chore.startTime)} - ${
                DateTimeParser.parseTimeToText(
                    chore.endTime
                )
            }",
            style = style,
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )

        when (chore::class) {
            CollegeChore::class -> CollegeContent(chore as CollegeChore)

            GroceryChore::class -> GroceryContent(
                items = (chore as GroceryChore).items,
                max = 300.dp,
                onGroceryListUpdated = { updatedItems ->
                    onGroceriesUpdated(
                        GroceryChore(
                            chore = chore,
                            items = updatedItems,
                        )
                    )
                },
            )

            GymChore::class -> GymContent(chore as GymChore, onExerciseDeleted = { chore ->
                onWorkoutChanged(chore)
            })

            else -> {}
        }

        Text(
            text = "Priority: ${chore.priority.name}",
            style = style,
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            color = when (chore.priority) {
                Priority.LOW -> MaterialTheme.colorScheme.onSurfaceVariant
                Priority.NORMAL -> MaterialTheme.colorScheme.primary
                Priority.HIGH -> MaterialTheme.colorScheme.error
            },
            textAlign = TextAlign.Start
        )

        DayOfWeekPicker(
            selectedDays = chore.daysOfWeek,
            clickable = false
        )

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {
                    onDismiss()
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.secondary,
                    contentColor = MaterialTheme.colorScheme.onSecondary,
                ),
                modifier = Modifier.clip(RoundedCornerShape(8.dp)).weight(1f)
            ) {
                Text("Cancel")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    onFinish(chore.choreId, date)
                    onDismiss()
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                ),
                modifier = Modifier.clip(RoundedCornerShape(8.dp)).weight(1f)
            ) {
                Text("Finish")
            }
        }
    }
}

@Composable
private fun CollegeContent(
    chore: CollegeChore
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Subject: ${chore.subject}",
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )
        Text(
            text = "Location: ${chore.location}",
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )
        Text(
            text = "Professor: ${chore.professor}",
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )
        if (chore.totalHours != null) {
            Text(
                text = "Total Hours: ${chore.totalHours}",
                modifier = Modifier.padding(4.dp).fillMaxWidth(),
                fontSize = 18.sp,
                textAlign = TextAlign.Start
            )

            Text(
                text = "Absence: ${chore.absencesCurrent} / ${chore.absencesAllowed}",
                modifier = Modifier.padding(4.dp).fillMaxWidth(),
                fontSize = 18.sp,
                textAlign = TextAlign.Start
            )

        }


    }
}

@Composable
private fun GymContent(
    chore: GymChore,
    onExerciseDeleted: (chore: Chore) -> Unit
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.fillMaxWidth()
            .heightIn(min = 0.dp, max = 300.dp)
            .verticalScroll(scrollState)
    ) {
        Text(
            text = chore.exerciseDay,
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )
        chore.workout.forEach { exercise ->
            ExerciseItem(
                exercise = exercise, onExerciseDeleted = { exercise ->
                    onExerciseDeleted(
                        GymChore(
                            chore = chore,
                            exerciseDay = chore.exerciseDay,
                            workout = chore.workout.filter { it != exercise }
                        )
                    )
                }
            )
        }
    }
}