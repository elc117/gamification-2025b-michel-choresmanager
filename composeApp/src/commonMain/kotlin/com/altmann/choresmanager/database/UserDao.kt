package com.altmann.choresmanager.database

import com.altmann.User
import com.altmann.choresmanager.local.DatabaseDriverFactory
import com.altmann.choresmanager.local.LocalDatabase

class UserDao(private val database : LocalDatabase) {

    fun getUsers() : List<User> {
        return database.getUsers()
    }

    fun insertUser(username: String) {
        database.insertUser(username)
    }

}