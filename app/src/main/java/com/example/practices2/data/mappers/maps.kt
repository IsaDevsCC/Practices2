package com.example.practices2.data.mappers

import com.example.practices2.data.local.dao.DataDAO
import com.example.practices2.data.remote.dto.ModelDTO
import com.example.practices2.domain.model.Model

fun ModelDTO.toModelView() = Model(
    id = id ?: "",
    name = name ?: "",
    description = history ?: "",
    photo = image ?: "",
)

fun ModelDTO.toModelDAO() = DataDAO(
    id = id ?: "",
    name = name ?: "",
    description = history ?: "",
    photo = image ?: "",
)

fun DataDAO.toModel() = Model(
    id = id ?: "",
    name = name ?: "",
    description = description ?: "",
    photo = photo ?: "",
)