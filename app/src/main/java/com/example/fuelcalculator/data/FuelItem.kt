package com.example.fuelcalculator.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FuelItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val valor: String,
    val kilometro: String,
    val distancia: String,
    val total: String
)
