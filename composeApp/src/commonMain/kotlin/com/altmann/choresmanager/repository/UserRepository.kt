package com.altmann.choresmanager.repository

import com.altmann.choresmanager.network.model.UserRequest
import com.altmann.choresmanager.network.ApiClient
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.network.IUserRepository
import com.altmann.choresmanager.network.model.UserResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class UserRepository(
    private val api: ApiClient = ApiClient()
) : IUserRepository {

    val URL = ApiClient.BASE_URL + "users"

    suspend fun getBase() : ApiResult<String>{
        return api.get(ApiClient.BASE_URL)
    }

    override suspend fun registerUser(user : UserRequest) : ApiResult<Unit> {
        return api.post(URL, user)
    }

    override suspend fun authenticateUser(
        email: String,
        password: String
    ): ApiResult<UserResponse> {
        return api.get("$URL/authenticate?email=$email&password=$password")
    }
//        api.http.post(ApiClient.BASE_URL, password)

    override suspend fun removeUser(userId: Int): ApiResult<Boolean> {
        TODO("Not yet implemented")
    }


}

