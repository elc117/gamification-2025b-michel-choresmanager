package com.altmann.choresmanager.utils

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlinx.datetime.number

class DateTimeParser {
    companion object {
        fun parseTextToTime(text: String): LocalTime {
            val parts = text.split(":")
            if (parts.size != 2) return LocalTime(0, 0)
            val time =
                LocalTime(hour = parts[0].toIntOrNull() ?: 0, minute = parts[1].toIntOrNull() ?: 0)
            return time
        }

        fun parseTimeToText(time: Pair<Int, Int>): String {
            val hours = time.first / 60
            val minutes = time.second % 60
            val hoursTxt = hours.toString().padStart(2, '0')
            val minutesTxt = minutes.toString().padStart(2, '0')
            return ("$hoursTxt:$minutesTxt")
        }

        fun parseTextToDate(text: String): LocalDate {
            val parts = text.split("/")
            if (parts.size != 3) return LocalDate(2000, 1, 1)
            val day = parts[0].toInt()
            val month = parts[1].toInt()
            val year = parts[2].toInt()
            val auxDate = LocalDate(year, month, 1)
            val maxDays = CalendarHelper.getDaysInMonth(auxDate)
            if (day > maxDays) {
                return LocalDate(year, month, maxDays)
            } else {
                return LocalDate(year, month, day)
            }
        }

        fun parseDateToText(date: LocalDate): String {
            val dayTxt = date.dayOfMonth.toString().padStart(2, '0')
            val monthTxt = date.month.number.toString().padStart(2, '0')
            val yearTxt = date.year.toString().padStart(4, '0')
            return ("$dayTxt/$monthTxt/$yearTxt")
        }
    }
}