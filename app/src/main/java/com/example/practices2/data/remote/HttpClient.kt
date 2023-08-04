package com.example.practices2.data.remote

import com.example.practices2.data.remote.dto.ModelDTO
import com.example.practices2.domain.model.Model
import retrofit2.http.GET

/**
 * - REALIZAMOS LA DEFINICIÓN DE LOS MÉTODOS HTTPS DESDE UNA INTERFACE A IMPLEMENTAR, LAS FUNCIONES SERÁN ASÍNCRONAS Y EN EL
 * - ÁMBITO DE UNA CORROUTINE, POR ELLO SERÁ NECESARIO LA DEFINICIÓN DE LAS FUNCIONES COMO SUSPEND
 * */
interface HttpClient {

    @GET("api/personajes?limit=300")
    suspend fun DownloadList() : List<ModelDTO>
}