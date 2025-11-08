package com.altmann.choresmanager.local

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import com.altmann.ChoresDatabase

class DesktopDatabaseDriverFactory : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        val driver = JdbcSqliteDriver("jdbc:sqlite:chores.db")
        ChoresDatabase.Schema.create(driver)
        return driver
    }
}