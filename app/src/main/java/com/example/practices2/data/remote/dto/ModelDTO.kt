package com.example.practices2.data.remote.dto

import com.squareup.moshi.Json

/**
 * - MAPPEA EL MODELO DIRECTAMENTE DESDE EL PROPORCIONADO POR LA API
 */

/*data class SimpsonsDTO(
    @Json(name = "docs")val docs: List<DocX>,
    val hasNextPage: Boolean,
    val hasPrevPage: Boolean,
    val limit: Int,
    val nextPage: Int,
    val page: Int,
    val pagingCounter: Int,
    val prevPage: Any,
    val totalDocs: Int,
    val totalPages: Int
)

data class DocX(
    @Json(name = "_id") val id : String?,
    @Json(name = "Nombre") val name : String?,
    @Json(name = "Historia") val history : String?,
    @Json(name = "Imagen") val image : String?,
    @Json(name = "Genero") val genre : String?,
    @Json(name = "Estado") val state : String?,
    @Json(name = "Ocupacion") val ocupation : String?,
)*/

data class Data(
    @Json(name = "docs") val docs: List<ModelDTO>,
    //@Json(name = "totalDocs") val hasNextPage: Boolean,
    //@Json(name = "limit") val hasPrevPage: Boolean,
    //@Json(name = "totalPages") val limit: Int,
    //@Json(name = "page") val nextPage: Int,
    //@Json(name = "pagingCounter") val page: Int,
    //@Json(name = "hasPrevPage") val pagingCounter: Int,
    //@Json(name = "hasNextPage") val prevPage: Any,
    //@Json(name = "prevPage") val totalDocs: Int,
    //@Json(name = "nextPage") val totalPages: Int
)

data class ModelDTO(
    @Json(name = "_id") val id : String?,
    @Json(name = "Nombre") val name : String?,
    @Json(name = "Historia") val history : String?,
    @Json(name = "Imagen") val image : String?,
    @Json(name = "Genero") val genre : String?,
    @Json(name = "Estado") val state : String?,
    @Json(name = "Ocupacion") val ocupation : String?,
)