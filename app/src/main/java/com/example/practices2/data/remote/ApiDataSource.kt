package com.example.practices2.data.remote

import com.example.practices2.data.remote.dto.ModelDTO
import com.example.practices2.domain.model.Model

/*
* - DEFINICIÓN DE LOS MÉTODOS A IMPLEMENTAR POR LA API
*/
interface ApiDataSource {
    suspend fun getDataList() : List<ModelDTO>
}