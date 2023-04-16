package com.example.detski_mir.sampledata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "auth")
data class auth(
    @PrimaryKey val login: String,
    @ColumnInfo(name = "level")
    var password: String,
    var lev: String
)
