package com.example.clean_arch_zwayten.data.repository

import com.example.clean_arch_zwayten.data.source.local.AppDatabase
import com.example.clean_arch_zwayten.data.source.local.dao.CarDao
import com.example.clean_arch_zwayten.data.source.local.model.Car
import com.example.clean_arch_zwayten.domain.repository.CarRepository
import javax.inject.Inject

class CarRepositoryImp @Inject constructor(private val carDao: CarDao): CarRepository {

    override fun getAllCars(): MutableList<Car> {
        return carDao.getAllCars()
    }

    override fun getOneById(id: Long): Car? {
        TODO("Not yet implemented")
    }

    override fun getOneByName(name: String): Car? {
        return carDao.getOneByName(name)
    }

    override fun addCar(car: Car) {
        return carDao.insert(car)
    }

    override fun deleteCar(car: Car) {
        return carDao.delete(car)
    }


}