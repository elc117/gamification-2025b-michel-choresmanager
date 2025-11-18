package com.altmann.choresmanager.ui.screens.components.grocerychore

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.models.chores.grocery.Item
import com.altmann.choresmanager.ui.screens.components.XButton
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid


@OptIn(ExperimentalUuidApi::class)
@Composable
fun GroceryContent(
    items: List<Item>,
    min : Dp = 0.dp,
    max : Dp = 300.dp,
    onGroceryListUpdated: (List<Item>) -> Unit
) {
    val itemName = remember { mutableStateOf("") }
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
    GroceryList(items, onGroceryListUpdated,min, max)
}

@Composable
fun GroceryList(
    items: List<Item>,
    onGroceryListUpdated: (List<Item>) -> Unit,
    minHeight : Dp = 0.dp,
    maxHeight : Dp
) {
    val scrollState = rememberScrollState()
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .heightIn(min = minHeight, max = maxHeight)
            .verticalScroll(scrollState)) {
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
                            if (newQuantity != 0) {
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