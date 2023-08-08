package com.example.fuelcalculator.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface FuelDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: FuelItem)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(item: FuelItem)

    @Delete
    suspend fun delete(item: FuelItem)

    @Query("SELECT * FROM FuelItem")
    fun getAllItems(): LiveData<List<FuelItem>>
}