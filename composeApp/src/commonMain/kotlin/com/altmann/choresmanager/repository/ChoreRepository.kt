package com.altmann.choresmanager.repository

import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.network.model.response.ChoreResponseBase
import com.altmann.choresmanager.network.ApiClient
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.utils.ResponseToChore

class ChoreRepository(private val api: ApiClient = ApiClient()) : IChoreRepository{

    private val URL = ApiClient.BASE_URL + "chores/"

    override suspend fun getChores(userId: Int): ApiResult<List<ChoreResponseBase>> {
        return api.get("$URL$userId")
    }

    override suspend fun updateChore(
        userId: Int,
        chore: ChoreResponseBase
    ): ApiResult<ChoreResponseBase> {
        return api.post("$URL$userId/${chore.choreId}", chore)
    }

    override suspend fun addChore(
        userId: Int,
        chore: Chore
    ): ApiResult<ChoreResponseBase> {
        return api.post("$URL$userId", ResponseToChore.toResponse(chore))
    }



}