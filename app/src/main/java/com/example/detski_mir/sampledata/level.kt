package com.example.detski_mir.sampledata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "level")
data class level(
    @PrimaryKey val id: Int,
    val name: String
)