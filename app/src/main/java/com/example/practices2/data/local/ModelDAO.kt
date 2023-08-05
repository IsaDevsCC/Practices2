package com.example.practices2.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.practices2.data.local.dao.DataDAO

@Dao
interface ModelDAO {

    @Query("SELECT * FROM data")
    suspend fun getAll() : List<DataDAO>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertInto(list: List<DataDAO>)
}