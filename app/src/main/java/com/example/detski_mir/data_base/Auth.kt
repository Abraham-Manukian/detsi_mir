package com.example.detski_mir.data_base

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "auth")
data class auth(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "login")
    var login: String,
    @ColumnInfo(name = "lev")
    var lev: String,
    @ColumnInfo(name = "password")
    var password: String,
)
