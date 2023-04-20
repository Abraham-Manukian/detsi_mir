package com.example.detski_mir.sampledata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "goods")
data class goods(
    @PrimaryKey(autoGenerate = true)
    val index: Int,
    @ColumnInfo(name = "type")
    val type: String,
    @ColumnInfo(name = "name_goods")
    val name_goods: String,
    @ColumnInfo(name = "price")
    val price: Double,
    @ColumnInfo(name = "amount")
    val amount: Double,
)