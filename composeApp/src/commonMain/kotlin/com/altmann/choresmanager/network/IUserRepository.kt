package com.altmann.choresmanager.network

interface IUserRepository {
    suspend fun registerUser(name : String, email: String, password: String)
    suspend fun removeUser(userId: Int): Boolean
}