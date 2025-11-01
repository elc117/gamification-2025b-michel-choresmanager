package com.altmann.choresmanager

// External js functions

private fun getCurrentDayJS(): Int =
    js("new Date().getDate()")

private fun getCurrentMonthJS(): Int =
    js("new Date().getMonth()")

private fun getCurrentYearJS(): Int =
    js("new Date().getFullYear()")

private fun getDaysInMonthJS(month: Int, year: Int): Int =
    js("new Date(month, year + 1, 0).getDate()")

private fun getFirstDayOfWeekJS(month: Int, year: Int): Int =
    js("new Date(month, year + 1, 0).getDay()")

actual class DateProvider {
    actual fun getCurrentDay(): Int = getCurrentDayJS()

    actual fun getCurrentMonth(): Int = getCurrentMonthJS()

    actual fun getCurrentYear(): Int = getCurrentYearJS()

    actual fun getDaysInMonth(month: Int, year: Int): Int = getDaysInMonthJS(month, year)

    actual fun getFirstDayOfWeek(month: Int, year: Int): Int = getFirstDayOfWeekJS(month, year)
}