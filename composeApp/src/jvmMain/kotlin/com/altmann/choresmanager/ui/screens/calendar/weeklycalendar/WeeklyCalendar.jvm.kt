package com.altmann.choresmanager.ui.screens.calendar.weeklycalendar

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.ScrollbarStyle
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.theming.MyTheme
import javax.swing.plaf.ScrollBarUI

@Composable
actual fun ScrollBar(scrollState: ScrollState) {
    Box(modifier = Modifier.fillMaxHeight().width(8.dp)) {
        VerticalScrollbar(
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
            adapter = rememberScrollbarAdapter(scrollState),
            style = ScrollbarStyle(
                minimalHeight = 16.dp,
                thickness = 8.dp,
                shape = RoundedCornerShape(4.dp),
                hoverDurationMillis = 0,
                unhoverColor = MyTheme.theme.primaryContainer,
                hoverColor = MyTheme.theme.primary
            )
        )
    }
}