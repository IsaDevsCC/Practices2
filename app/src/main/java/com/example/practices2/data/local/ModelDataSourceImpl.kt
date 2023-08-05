package com.example.practices2.data.local

import com.example.practices2.data.local.dao.DataDAO

class ModelDataSourceImpl(
    private val modelDAO: ModelDAO
) : ModelDataSource{
    override suspend fun getAll(): List<DataDAO> = modelDAO.getAll()

    override suspend fun insertInto(list: List<DataDAO>) = modelDAO.insertInto(list)
}
