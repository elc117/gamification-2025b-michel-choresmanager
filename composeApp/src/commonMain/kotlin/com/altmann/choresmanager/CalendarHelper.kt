package com.altmann.choresmanager

import androidx.compose.runtime.remember
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.minus
import kotlinx.datetime.plus

object CalendarHelper {
    val dateProvider = DateProvider()

    // Determines the days that should be present in the calendar grid
    fun monthGridWindow(anchor : LocalDate) : Pair<LocalDate, LocalDate> {
        val firstOfMonth = LocalDate(anchor.year, anchor.month.ordinal+1, 1)
        val gridStart = previousOrSameSunday(firstOfMonth)
        val end = gridStart.plus(DatePeriod(days = 41)) // a 7x6 grid has 42 cells
        return gridStart to end
    }

    // Calculates the first day that should appear on the month (if its sunday its the current's month first day)
    fun previousOrSameSunday(date: LocalDate): LocalDate {
        val daysBack = when (date.dayOfWeek) {
            DayOfWeek.SUNDAY -> 0
            DayOfWeek.MONDAY -> 1
            DayOfWeek.TUESDAY -> 2
            DayOfWeek.WEDNESDAY -> 3
            DayOfWeek.THURSDAY -> 4
            DayOfWeek.FRIDAY -> 5
            DayOfWeek.SATURDAY -> 6
            else -> 0
        }
        return date.minus(DatePeriod(days = daysBack))
    }
    // Creates a LocalDate type with the current day
    fun today() : LocalDate {
        return LocalDate(dateProvider.getCurrentYear(), dateProvider.getCurrentMonth()+1, dateProvider.getCurrentDay())
    }
}