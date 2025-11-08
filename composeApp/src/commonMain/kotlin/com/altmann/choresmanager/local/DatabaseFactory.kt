package com.altmann.choresmanager.local

import app.cash.sqldelight.db.SqlDriver
import com.altmann.Chore
import com.altmann.ChoresDatabase
import com.altmann.User

interface DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}

class LocalDatabase(
    databaseDriverFactory: DatabaseDriverFactory
) {
    private val database = ChoresDatabase(
        databaseDriverFactory.createDriver()
    )
    private val query = database.choresDatabaseQueries

    fun getUsers(): List<User> {
        return query.getAllUsers().executeAsList().map {
            User(
                userId = it.userId,
                username = it.username
            )
        }
    }

    fun insertUser(username: String) {
        query.insertUser(username)
    }
}