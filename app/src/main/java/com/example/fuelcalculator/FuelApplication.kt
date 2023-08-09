package com.example.fuelcalculator

import android.app.Application
import androidx.room.Room
import com.example.fuelcalculator.data.FuelDataBase

class FuelApplication: Application() {

    private lateinit var db: FuelDataBase

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            applicationContext, FuelDataBase::class.java, "fuel_data_base"
        ).build()
    }

    fun getDataBase(): FuelDataBase {
        return db
    }
}