package com.altmann.choresmanager.repository

import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.network.model.response.ChoreResponseBase
import com.altmann.choresmanager.network.ApiResult

interface IChoreRepository {
    suspend fun getChores(userId : Int) : ApiResult<List<ChoreResponseBase>>
    suspend fun addChore(userId: Int, chore: Chore) : ApiResult<ChoreResponseBase>
}