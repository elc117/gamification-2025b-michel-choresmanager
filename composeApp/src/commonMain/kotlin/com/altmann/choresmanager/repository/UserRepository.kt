package com.altmann.choresmanager.repository

import com.altmann.choresmanager.network.ApiClient
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.network.IUserRepository
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class UserRepository(
    private val api: ApiClient = ApiClient()
) : IUserRepository {

    suspend fun getBase() : ApiResult<String>{
        return api.get(ApiClient.BASE_URL)
    }

    override suspend fun registerUser(name: String, email: String, password: String) {
        TODO("Not yet implemented")
    }
//        api.http.post(ApiClient.BASE_URL, password)

    override suspend fun removeUser(userId: Int): Boolean {
        TODO("Not yet implemented")
    }


}

