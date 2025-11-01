package com.altmann.choresmanager

expect class DateProvider() {
    fun getCurrentDay() : Int

    fun getCurrentMonth() : Int

    fun getCurrentYear() : Int

    fun getDaysInMonth(month: Int, year : Int) : Int

    fun getFirstDayOfWeek(month : Int, year : Int) : Int // 0 == Sunday
}