package com.altmann.choresmanager.ui.screens.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun XButton(
    onClick : () -> Unit,
) {
    TextButton(
        onClick = {
            onClick()
        },
        colors = (ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .size(50.dp)
            .padding(8.dp)
    ) {
        Text("X", textAlign = TextAlign.Center)
    }
}