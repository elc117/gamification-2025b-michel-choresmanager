package com.altmann.choresmanager.repository

import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.network.model.UserRequest
import com.altmann.choresmanager.network.model.response.UserResponse

interface IUserRepository {
    suspend fun registerUser(user : UserRequest) : ApiResult<Unit>
    suspend fun updateUser(user: UserResponse): ApiResult<Unit>
    suspend fun authenticateUser(email: String, password: String): ApiResult<UserResponse>
    suspend fun removeUser(userId: Int): ApiResult<Boolean>
}