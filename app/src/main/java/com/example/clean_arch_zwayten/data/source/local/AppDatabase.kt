package com.example.clean_arch_zwayten.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clean_arch_zwayten.data.source.local.dao.CarDao
import com.example.clean_arch_zwayten.data.source.local.model.Car

@Database(entities = [Car::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun carDao(): CarDao

    companion object {
        const val DB_NAME = "CarDatabase.db"
    }
}