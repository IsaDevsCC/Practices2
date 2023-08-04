package com.example.practices2.data.remote

//import com.example.practices2.data.remote.dto.ModelDTO
import com.example.practices2.data.remote.dto.ModelDTO
//import com.example.practices2.data.remote.dto.SimpsonsDTO
import com.example.practices2.domain.model.Model

/**
 * - Implementa los métodos declarados en la interface
 * - Recibe por parámetro la interface con los métodos request
 */
class ApiDataSourceImplement(
    private val api : HttpClient
) : ApiDataSource {

    override suspend fun getDataList(): List<ModelDTO> = api.DownloadList()
    //override suspend fun getDataList(): List<SimpsonsDTO> = api.DownloadList()
}