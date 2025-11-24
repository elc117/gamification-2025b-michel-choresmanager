package com.altmann.choresmanager.network

import com.altmann.choresmanager.network.model.UserRequest
import com.altmann.choresmanager.models.user.User
import com.altmann.choresmanager.network.model.UserResponse

interface IUserRepository {
    suspend fun registerUser(user : UserRequest) : ApiResult<Unit>
    suspend fun authenticateUser(email: String, password: String): ApiResult<UserResponse>
    suspend fun removeUser(userId: Int): ApiResult<Boolean>
}