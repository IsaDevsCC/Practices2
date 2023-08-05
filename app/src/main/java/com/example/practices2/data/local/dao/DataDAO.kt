package com.example.practices2.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data")
data class DataDAO(
    @PrimaryKey @ColumnInfo(name = "id") val id : String,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "description") val description : String,
    @ColumnInfo(name = "photo") val photo : String,
)
