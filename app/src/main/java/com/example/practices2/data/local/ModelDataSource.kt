package com.example.practices2.data.local

import com.example.practices2.data.local.dao.DataDAO

interface ModelDataSource {
    suspend fun getAll() : List<DataDAO>
    suspend fun insertInto(list: List<DataDAO>)
}