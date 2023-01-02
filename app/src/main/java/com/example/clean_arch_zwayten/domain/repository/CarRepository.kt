package com.example.clean_arch_zwayten.domain.repository

import com.example.clean_arch_zwayten.data.source.local.model.Car

/**
 * To make an interaction between [CarRepositoryImp] & [CarUseCases]
 * */
interface CarRepository {
    fun getAllCars(): MutableList<Car>
    fun getOneById(id: Long): Car?
    fun getOneByName(name: String): Car?
    fun addCar(car: Car)
    fun deleteCar(car: Car)

}