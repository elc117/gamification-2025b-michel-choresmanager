package com.altmann.choresmanager.ui.screens.chore.grocerychore

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.grocery.Item
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupEvent
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupState
import kotlin.uuid.ExperimentalUuidApi

@Composable
fun GroceryChoreFields(onEvent: (ChorePopupEvent) -> Unit, state: ChorePopupState) {
    val openGroceryList = remember { mutableStateOf(false) }
    Box {
        Button(
            onClick = {
                openGroceryList.value = !openGroceryList.value
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Grocery List")
        }
        GroceryDropdown(
            open = openGroceryList.value,
            onDismiss = { openGroceryList.value = false },
            onGroceryListUpdated = { groceryList ->
                onEvent(
                    ChorePopupEvent.GroceryItemsChanged(
                        groceryList
                    )
                )
            },
            items = state.items,
        )
    }
}

@OptIn(ExperimentalUuidApi::class)
@Composable
fun GroceryDropdown(
    open: Boolean,
    onDismiss: () -> Unit,
    onGroceryListUpdated: (List<Item>) -> Unit,
    items: List<Item>,
) {
    val itemName = remember { mutableStateOf("") }
    DropdownMenu(
        expanded = open,
        onDismissRequest = { onDismiss() },
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(300.dp).padding(horizontal = 4.dp)
        ) {
            Text("Grocery Items", modifier = Modifier.padding(bottom = 8.dp))
            GroceryContent(items, onGroceryListUpdated = onGroceryListUpdated, min = 300.dp, max = 300.dp)
        }
    }
}