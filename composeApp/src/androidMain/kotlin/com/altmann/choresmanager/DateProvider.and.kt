package com.altmann.choresmanager

import java.util.Calendar

actual class DateProvider {
    val calendar = Calendar.getInstance()

    actual fun getCurrentDay() : Int {
        return calendar.get(Calendar.DAY_OF_MONTH)
    }

    actual fun getCurrentMonth(): Int {
        return calendar.get(Calendar.MONTH)
    }

    actual fun getCurrentYear(): Int {
        return calendar.get(Calendar.YEAR)
    }

}