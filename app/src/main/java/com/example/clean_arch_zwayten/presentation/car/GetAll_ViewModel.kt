package com.example.clean_arch_zwayten.presentation.car

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clean_arch_zwayten.data.source.local.model.Car


import com.example.clean_arch_zwayten.domain.usecase.car.getAll_UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GetAll_ViewModel @Inject constructor(private val getAll_UseCase: getAll_UseCase): ViewModel() {
    var carDataList : MutableList<Car>
    init {
        carDataList = ArrayList()
    }


    fun execute() {
        viewModelScope.launch {
            carDataList = getAll_UseCase.invoke()
        }
    }
}