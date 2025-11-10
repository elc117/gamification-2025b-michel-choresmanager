package com.altmann.choresmanager.ui.screens.sidebar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import choresmanager.composeapp.generated.resources.Res
import choresmanager.composeapp.generated.resources.compose_multiplatform
import choresmanager.composeapp.generated.resources.frajola_icon
import com.altmann.choresmanager.DateProvider
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.ui.screens.addchorepopup.AddChorePopup
import com.altmann.choresmanager.ui.screens.calendar.CalendarScreen
import com.altmann.choresmanager.ui.screens.components.CircleUserIcon
import com.altmann.choresmanager.ui.screens.home.HomeViewModel
import com.altmann.choresmanager.utils.CalendarHelper
import org.jetbrains.compose.resources.painterResource

@Composable
fun SideBar(viewModel: HomeViewModel) {
    val chores by viewModel.chores.collectAsState()
    var addChorePopup by remember { mutableStateOf(false) }
    Surface(
        tonalElevation = 4.dp,
        modifier = Modifier
            .width(200.dp)
            .fillMaxHeight()
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically){
                CircleUserIcon(
                    imageResource = Res.drawable.frajola_icon,
                    borderWidth = 2.dp,
                    modifier = Modifier.padding(8.dp)
                        .clip(CircleShape)
                        .clickable {

                        }
                )
                Text(
                    text = "Michel",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            TextButton(
                shape = RoundedCornerShape(4.dp),
                onClick = {

                }
            ) {
                Text("Achievements", fontWeight = FontWeight.Bold)
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Chores:",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp, start = 16.dp)
            )
            Spacer(
                Modifier
                    .background(color = MaterialTheme.colorScheme.primary, shape = RectangleShape)
                    .fillMaxWidth()
                    .size(2.dp)
            )
            AddChorePopup(
                onDismiss = {
                    addChorePopup = false
                },
                date = CalendarHelper.today(),
                addChore = { chore -> viewModel.addChore(chore) },
                visible = addChorePopup
            )
            TextButton(
                shape = RoundedCornerShape(4.dp),
                onClick = {
                    addChorePopup = true
                }
            ) {
                Text("Add Chore", fontWeight = FontWeight.Bold)
            }
            LazyColumn {
                items(chores) { chore ->
                    ChoreItem(chore = chore, onSelect = {
                        viewModel.enableDisableChore(chore)
                    }, modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun ChoreItem(chore: Chore, onSelect: (chore: Chore) -> Unit, modifier: Modifier = Modifier) {
    var selected by remember { mutableStateOf(true) }
    Surface(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.padding(horizontal = 4.dp)
            .fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = selected,
                onCheckedChange = {
                    onSelect(chore)
                    selected = !selected
                },
                modifier = Modifier.size(30.dp),
                colors = CheckboxDefaults.colors(
                    checkedColor = chore.color,
                    uncheckedColor = chore.color
                )
            )
            Spacer(Modifier.width(4.dp))
            Text(
                text = chore.title,
                modifier = modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }
    }

}