package com.altmann.choresmanager

expect class DateProvider() {
    fun getCurrentDay() : Int

    fun getCurrentMonth() : Int

    fun getCurrentYear() : Int
}