package com.altmann.choresmanager.models.chores

enum class Priority(val label : String, val value : Int){
    LOW("Low", 0),
    NORMAL("Normal", 1),
    HIGH("High", 2);

    companion object {
        fun fromValue(value : Int) = entries.firstOrNull {it.value == value} ?: NORMAL
    }
}