package com.altmann.choresmanager.models.chores.grocery

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val itemId: String,
    val name: String,
    var quantity: Int
)