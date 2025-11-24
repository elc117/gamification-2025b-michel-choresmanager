package com.altmann.choresmanager.repository

import api.model.response.ChoreResponseBase
import com.altmann.choresmanager.network.ApiClient
import com.altmann.choresmanager.network.ApiResult

class ChoreRepository(private val api: ApiClient = ApiClient()) : IChoreRepository{

    private val URL = ApiClient.BASE_URL + "chores/"

    override suspend fun getChores(userId: Int): ApiResult<List<ChoreResponseBase>> {
        return api.get("$URL$userId")
    }

}