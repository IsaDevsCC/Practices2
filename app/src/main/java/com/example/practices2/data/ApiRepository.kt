package com.example.practices2.data

import com.example.practices2.domain.model.Model

interface ApiRepository {

    suspend fun getDataList() : List<Model>
}