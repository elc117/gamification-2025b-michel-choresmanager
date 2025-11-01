package com.altmann.choresmanager

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun CalendarScreen() {
    val dateProvider = remember {DateProvider()}
    val todayDay = dateProvider.getCurrentDay()
    val todayMonth = dateProvider.getCurrentMonth()
    val todayYear = dateProvider.getCurrentYear()

    Column {
        Text("${todayDay} - ${todayMonth} - ${todayYear}")
    }

}
