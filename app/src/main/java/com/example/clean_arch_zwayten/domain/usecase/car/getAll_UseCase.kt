package com.example.clean_arch_zwayten.domain.usecase.car


import com.example.clean_arch_zwayten.data.source.local.model.Car
import com.example.clean_arch_zwayten.domain.repository.CarRepository
import javax.inject.Inject

class getAll_UseCase @Inject constructor(private val repository: CarRepository) {
    suspend operator fun invoke(): MutableList<Car>{
        return repository.getAllCars()
    }
}