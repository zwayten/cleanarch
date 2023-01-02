package com.example.clean_arch_zwayten.data.source.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Car")
data class Car(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "car_picture")
    val car_picture:String,

    @ColumnInfo(name = "name")
    val name:String,

    @ColumnInfo(name = "availability")
    val availability:Boolean,

    @ColumnInfo(name = "price")
    val price:Int
)
