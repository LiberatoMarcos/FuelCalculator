package com.example.fuelcalculator.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [FuelItem::class], version = 1)
abstract class FuelDataBase: RoomDatabase() {
    abstract fun dao(): FuelDao
}