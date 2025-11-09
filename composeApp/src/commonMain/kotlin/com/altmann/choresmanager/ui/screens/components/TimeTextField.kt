package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.utils.DateTimeParser
import kotlinx.coroutines.selects.select
import kotlinx.datetime.LocalTime

@Composable
fun TimeTextField(
    timeTxt: MutableState<TextFieldValue>,
    time: MutableState<LocalTime>,
    label: String,
    modifier: Modifier
) {
    TextField(
        value = timeTxt.value,
        onValueChange = { newValue ->
            val input = newValue.text
            val filteredValue = formatTimeInput(input)

            if (filteredValue.length <= 5) {
                val updated = if (filteredValue.length == 2 && timeTxt.value.text.length == 1) {
                    "$filteredValue:"
                } else {
                    filteredValue
                }
                timeTxt.value = TextFieldValue(updated, selection = TextRange(updated.length))

                time.value = DateTimeParser.parseTextToTime(filteredValue)
            }
        },
        maxLines = 1,
        label = { Text(label) },
        modifier = modifier.padding(8.dp),
    )
}

fun formatTimeInput(input:String) : String {
    val firstFiltered = input.filterIndexed { index, c ->
        when (index) {
            0, 1 -> c.isDigit() // First two characters: hours
            2 -> c == ':' // Third character: colon
            3, 4 -> c.isDigit() // Last two characters: minutes
            else -> false // Ignore any extra characters
        }
    }
    val filteredValue = firstFiltered.filterIndexed { index, c ->
        when (index) {
            0 -> c.digitToInt() <= 2 // First hour max 2
            1 -> (firstFiltered[0].digitToInt() == 2 && c.digitToInt() <= 3 || firstFiltered[0].digitToInt() < 2) // Secound hour max 3 if first is 2
            3 -> c.digitToInt() <= 5// First minute max 5
            else -> true
        }
    }
    return filteredValue
}