package com.example.detski_mir.data_base

import androidx.room.*

@Dao
interface levelDao {
    @Query("SELECT * FROM level")
    fun getAllLevels(): List<level>

    @Query("SELECT * FROM level WHERE id = :levelId")
    fun getLevelById(levelId: Int): level?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLevel(level: level)

    @Delete
    fun deleteLevel(level: level)
}