package com.altmann.choresmanager.ui.screens.components.fields

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun ValidatedTextField(
    label : String,
    text : String,
    onValueChange : (String) -> Unit,
    validator : (String) -> String?,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    var error by remember { mutableStateOf<String?>(null) }

    Column {
        TextField(
            value = text,
            onValueChange = {
                onValueChange(it)
                error = validator(it)
            },
            label = { Text(label) },
            isError = error != null,
            singleLine = true,
            visualTransformation = visualTransformation
        )
        if (error != null) {
            Text(
                text = error!!,
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}