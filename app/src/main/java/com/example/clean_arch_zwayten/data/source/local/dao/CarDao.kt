package com.example.clean_arch_zwayten.data.source.local.dao

import androidx.room.*
import com.example.clean_arch_zwayten.data.source.local.model.Car


/**
 * it provides access to [Car] underlying database
 * */
@Dao
interface CarDao {
    @Query("SELECT * FROM Car")
    fun getAllCars(): MutableList<Car>

    @Query("SELECT * FROM Car where id = :id")
    fun getOneById(id: Long): Car?

    @Query("SELECT * FROM Car where name = :name")
    fun getOneByName(name: String): Car?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(car: Car)

    @Update
    fun update(car: Car)

    @Delete
    fun delete(car: Car)



}