package com.altmann.choresmanager.ui.screens.components.gymchore

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.gym.Exercise
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupEvent
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupState
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.FieldSpacer
import com.altmann.choresmanager.ui.screens.components.XButton
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Composable
fun GymChoreFields(onEvent: (ChorePopupEvent) -> Unit, state: ChorePopupState) {
    val openExerciseList = remember { mutableStateOf(false) }
    val workout = state.workout
    Row(verticalAlignment = Alignment.CenterVertically) {
        TextField(
            value = state.exerciseDay,
            onValueChange = { exerciseDay -> onEvent(ChorePopupEvent.ExerciseDayChanged(exerciseDay)) },
            maxLines = 1,
            modifier = Modifier.weight(1f),
            label = { Text("Exercise day") },
        )
        Spacer(modifier = Modifier.width(4.dp))

        // Anchor button and dropdown together so the menu opens near the button
        Box(modifier = Modifier.weight(0.7f)) {
            Button(
                onClick = { openExerciseList.value = !openExerciseList.value },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Open exercises")
            }
            WorkoutDropdown(
                open = openExerciseList.value,
                onDismiss = { openExerciseList.value = false },
                onWorkoutUpdated = { workout -> onEvent(ChorePopupEvent.WorkoutChanged(workout)) },
                modifier = Modifier.align(Alignment.Center),
                workout = workout
            )
        }
    }
}

@Composable
fun WorkoutDropdown(
    open: Boolean,
    onDismiss: () -> Unit,
    onWorkoutUpdated: (List<Exercise>) -> Unit,
    modifier: Modifier = Modifier,
    workout: List<Exercise>
) {
    val addExerciseMenu = remember { mutableStateOf(false) }
    DropdownMenu(
        expanded = open,
        onDismissRequest = { onDismiss() },
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Exercises", modifier = Modifier.padding(8.dp))
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = {
                        addExerciseMenu.value = !addExerciseMenu.value
                    },
                    modifier = Modifier.padding(8.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text("New Exercise")
                }

            }
            Spacer(modifier = Modifier.height(8.dp))
            if (workout.isEmpty()) {
                Text("No exercises added", modifier = Modifier.padding(8.dp))
            } else {
                workout.forEach { exercise ->
                    ExerciseItem(
                        exercise = exercise, onExerciseDeleted = {
                            onWorkoutUpdated(workout.minus(it))
                        }, modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                }
            }
            AddExerciseDropdown(
                onExerciseCreated = {
                    onWorkoutUpdated(workout.plus(it))
                },
                open = addExerciseMenu.value,
                onDismiss = {
                    addExerciseMenu.value = false
                }
            )
        }
    }
}

@OptIn(ExperimentalUuidApi::class)
@Composable
fun AddExerciseDropdown(
    onExerciseCreated: (Exercise) -> Unit,
    open: Boolean,
    onDismiss: () -> Unit
) {

    DropdownMenu(
        expanded = open,
        onDismissRequest = { onDismiss() },
        modifier = Modifier,
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        val name = remember { mutableStateOf("") }
        val reps = remember { mutableStateOf("") }
        val sets = remember { mutableStateOf("") }
        Column(modifier = Modifier.width(300.dp)) {
            TextField(
                value = name.value,
                onValueChange = { name.value = it },
                maxLines = 1,
                modifier = Modifier.fillMaxWidth().padding(start = 4.dp, end = 4.dp, top = 4.dp),
                label = { Text("Exercise name") },
            )
            FieldSpacer()
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextField(
                    value = reps.value,
                    onValueChange = { reps.value = it },
                    maxLines = 1,
                    modifier = Modifier.weight(1f).padding(horizontal = 4.dp),
                    label = { Text("Reps") },
                )
                Spacer(modifier = Modifier.width(4.dp))
                TextField(
                    value = sets.value,
                    onValueChange = { sets.value = it },
                    maxLines = 1,
                    modifier = Modifier.weight(1f).padding(horizontal = 4.dp),
                    label = { Text("Sets") },
                )
            }
            Button(
                onClick = {
                    onExerciseCreated(
                        Exercise(
                            exerciseId = Uuid.random().toString(),
                            name = name.value,
                            reps = reps.value.toIntOrNull() ?: 0,
                            sets = sets.value.toIntOrNull() ?: 0
                        )
                    )
                    name.value = ""
                    reps.value = ""
                    sets.value = ""
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Add Exercise")
            }
        }
    }
}

@Composable
fun ExerciseItem(
    exercise: Exercise,
    onExerciseDeleted: (Exercise) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.primaryContainer,
        modifier = modifier
            .padding(2.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(4.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = exercise.name,
                        fontWeight = FontWeight.Normal,
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "${exercise.reps} x ${exercise.sets}",
                        fontWeight = FontWeight.Normal,
                    )
                }

                Spacer(Modifier.width(8.dp))

                XButton {
                    onExerciseDeleted(exercise)
                }

            }
        }
    }

}