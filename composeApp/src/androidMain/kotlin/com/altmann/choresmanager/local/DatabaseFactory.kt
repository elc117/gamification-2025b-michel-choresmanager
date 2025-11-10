package com.altmann.choresmanager.local

import android.content.Context
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.altmann.ChoresDatabase

class AndroidDatabaseDriverFactory(private val context: Context) : DatabaseDriverFactory {
    override fun createDriver() =
        AndroidSqliteDriver(schema = ChoresDatabase.Schema, context = context, name = "chores.db")
}