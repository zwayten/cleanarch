package com.example.clean_arch_zwayten.domain.usecase.car

import com.example.clean_arch_zwayten.data.source.local.model.Car
import com.example.clean_arch_zwayten.di.AppModule
import com.example.clean_arch_zwayten.domain.repository.CarRepository
import dagger.Component
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class AddToFavorite @Inject constructor(private val repository: CarRepository) {
     operator fun invoke(car: Car){
          repository.addCar(car)
    }
}