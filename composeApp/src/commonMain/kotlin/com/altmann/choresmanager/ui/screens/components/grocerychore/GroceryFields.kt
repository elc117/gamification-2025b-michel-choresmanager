package com.altmann.choresmanager.ui.screens.components.grocerychore

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.grocery.Item
import com.altmann.choresmanager.ui.screens.addchorepopup.ChorePopupEvent
import com.altmann.choresmanager.ui.screens.addchorepopup.ChorePopupState
import com.altmann.choresmanager.ui.screens.components.XButton
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

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
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp)
            ) {
                TextField(
                    value = itemName.value,
                    onValueChange = { newValue -> itemName.value = newValue },
                    label = { Text("Item Name") },
                    modifier = Modifier.weight(1f).padding(end = 4.dp)
                )
                Button(
                    onClick = {
                        onGroceryListUpdated(
                            items + Item(
                                itemId = Uuid.random().toString(),
                                name = itemName.value, quantity = 1
                            )
                        )
                    },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(0.6f).padding(start = 4.dp)
                ) {
                    Text("Add Item", textAlign = TextAlign.Center)
                }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                for (item in items) {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = MaterialTheme.colorScheme.primaryContainer,
                        modifier = Modifier.fillMaxWidth().padding(vertical = 2.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = item.name,
                                modifier = Modifier.weight(1f).padding(8.dp)
                            )
                            GroceryItemCounter(
                                value = item.quantity,
                                onValueChange = { newQuantity ->
                                    if (newQuantity == 0) {
                                        onGroceryListUpdated(
                                            items.filter { it.itemId != item.itemId }
                                        )
                                    } else {
                                        onGroceryListUpdated(
                                            items.map {
                                                if (it.itemId == item.itemId) {
                                                    Item(
                                                        itemId = it.itemId,
                                                        name = it.name,
                                                        quantity = newQuantity
                                                    )
                                                } else {
                                                    it
                                                }
                                            }
                                        )
                                    }
                                })
                            XButton {
                                onGroceryListUpdated(
                                    items.filter { it.itemId != item.itemId }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun GroceryItemCounter(
    value: Int,
    onValueChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val count = remember { mutableStateOf(value) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "$value",
            style = MaterialTheme.typography.bodyLarge
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TextButton(
                onClick = {
                    count.value += 1
                    onValueChange(count.value)
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(36.dp)
            ) {
                Text("+", style = MaterialTheme.typography.bodyMedium)
            }
            TextButton(
                onClick = {
                    if (count.value > 0) {
                        count.value -= 1
                        onValueChange(count.value)
                    }
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(36.dp)
            ) {
                Text("-", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}