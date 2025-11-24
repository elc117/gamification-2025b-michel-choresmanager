package com.altmann.choresmanager.repository

import api.model.response.ChoreResponseBase
import com.altmann.choresmanager.network.ApiResult

interface IChoreRepository {
    suspend fun getChores(userId : Int) : ApiResult<List<ChoreResponseBase>>
}