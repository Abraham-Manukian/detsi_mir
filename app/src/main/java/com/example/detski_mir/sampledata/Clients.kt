package com.example.detski_mir.sampledata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clients")
data class clients(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "name_clients")
    val name_clients: String,
    @ColumnInfo(name = "adres")
    val adres: String,
    @ColumnInfo(name = "sum")
    val sum: Double,
    @ColumnInfo(name = "bounses")
    val bounses: Int,
    @ColumnInfo(name = "number_phone")
    val number_phone: Long,
)