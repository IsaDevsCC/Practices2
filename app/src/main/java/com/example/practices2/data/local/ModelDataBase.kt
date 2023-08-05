package com.example.practices2.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.practices2.data.local.dao.DataDAO

@Database(entities = [DataDAO::class], version = 1, exportSchema = true)
abstract class ModelDataBase : RoomDatabase(){

    abstract fun modelDao() : ModelDAO
}