package com.altmann.choresmanager

// External js functions

private fun getCurrentDayJS(): Int =
    js("new Date().getDate()")

private fun getCurrentMonthJS(): Int =
    js("new Date().getMonth()")

private fun getCurrentYearJS(): Int =
    js("new Date().getFullYear()")


actual class DateProvider {
    actual fun getCurrentDay(): Int = getCurrentDayJS()

    actual fun getCurrentMonth(): Int = getCurrentMonthJS()

    actual fun getCurrentYear(): Int = getCurrentYearJS()

}