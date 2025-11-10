package com.altmann.choresmanager.ui.screens.components.fields

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import com.altmann.choresmanager.utils.DateTimeParser
import kotlinx.datetime.LocalDate

@Composable
fun DateTextField(
    dateTxt: MutableState<TextFieldValue>,
    date: MutableState<LocalDate>,
    label: String,
    modifier: Modifier
) {
    TextField(
        value = dateTxt.value,
        onValueChange = { newValue ->
            val input = newValue.text
            val filteredValue = formatDateInput(input)

            if (filteredValue.length <= 10) {
                val updated =
                    if (filteredValue.length == 2 && dateTxt.value.text.length == 1 || filteredValue.length == 5 && dateTxt.value.text.length == 4) {
                        "$filteredValue/"
                    } else {
                        filteredValue
                    }
                dateTxt.value = TextFieldValue(updated, selection = TextRange(updated.length))

                if (filteredValue.length == 10) {
                    val dateParsed = DateTimeParser.parseTextToDate(filteredValue)
                    date.value = dateParsed
                }
            }
        },
        maxLines = 1,
        label = { Text(label) },
        modifier = modifier
    )
}

fun formatDateInput(input: String): String {
    val firstFiltered = input.filterIndexed { index, c ->
        when (index) {
            0, 1 -> c.isDigit() // First two characters: day
            2 -> c == '/' // Third character: slash
            3, 4 -> c.isDigit()// Secound two characters: month
            5 -> c == '/' // Fifth character: slash
            6, 7, 8, 9 -> c.isDigit() // Last four characters: year
            else -> false // Ignore any extra characters
        }
    }
    val filteredValue = firstFiltered.filterIndexed { index, c ->
        when (index) {
            0 -> c.digitToInt() <= 3 // First day max 3
            1 -> (firstFiltered[0].digitToInt() == 3 && c.digitToInt() <= 1 || firstFiltered[0].digitToInt() < 3) // Second day max 1 if first is 3
            3 -> c.digitToInt() <= 1// First month max 1
            4 -> (firstFiltered[3].digitToInt() == 1 && c.digitToInt() <= 2 || firstFiltered[3].digitToInt() < 1) // Second month max 2 if first is 1
            6, 7, 8, 9 -> true // Year digits
            else -> true
        }
    }
    return filteredValue
}