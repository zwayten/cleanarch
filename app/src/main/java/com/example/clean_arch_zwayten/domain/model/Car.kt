package com.example.clean_arch_zwayten.domain.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Car(
    val id: Int,
    val car_picture:String,
    val name:String,
    val availability:Boolean,
    val price:Int
) {
    override fun toString(): String {
        return "Car(id=$id, car_picture='$car_picture', name='$name', availability=$availability, price=$price)"
    }
    fun toEntity(): com.example.clean_arch_zwayten.data.source.local.model.Car{
        return com.example.clean_arch_zwayten.data.source.local.model.Car(id = id,
            car_picture = car_picture,
            name = name,
            availability = availability,
            price = price)
    }
}
