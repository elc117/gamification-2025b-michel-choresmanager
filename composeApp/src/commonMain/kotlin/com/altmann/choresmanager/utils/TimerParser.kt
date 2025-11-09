package com.altmann.choresmanager.utils

class TimerParser {
    companion object {
        fun parseTextToTime(time: String): Pair<Int,Int> {
            val parts = time.split(":")
            if (parts.size != 2) return Pair(0,0)
            val hours = parts[0].toIntOrNull() ?: 0
            val minutes = parts[1].toIntOrNull() ?: 0
            return Pair(hours, minutes)
        }

        fun formatTimeToText(time : Pair<Int, Int>): String {
            val hours = time.first / 60
            val minutes = time.second % 60
            val hoursTxt = hours.toString().padStart(2, '0')
            val minutesTxt = minutes.toString().padStart(2, '0')
            return ("$hoursTxt:$minutesTxt")
        }
    }
}