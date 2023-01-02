package com.example.clean_arch_zwayten.presentation.car

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clean_arch_zwayten.R
import com.example.clean_arch_zwayten.domain.model.Car
import dagger.hilt.android.AndroidEntryPoint
import java.lang.Exception

@AndroidEntryPoint
class CarFragment : Fragment() {
    lateinit var carAdapter: CarAdapter
    lateinit var recycler_view_car: RecyclerView
    //private val viewModel: GetAll_ViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       try{


        val rootView = inflater.inflate(R.layout.fragment_car, container, false)

        var carList : MutableList<Car> = ArrayList()

        //viewModel.execute()


        recycler_view_car = rootView.findViewById(R.id.recycler_view_car)



        carList.add(Car(id= 0 ,car_picture = "kia_picanto",name = "kia picanto",availability = true ,price = 120))
        carList.add(Car(id= 1 ,car_picture = "polo_sedan",name = "polo sedan",availability = true ,price = 120))
        carList.add(Car(id= 2 ,car_picture = "kia_rio",name = "kia_rio",availability = true ,price = 1250 ))
        carList.add(Car(id= 3 ,car_picture = "polo8",name = "polo8",availability = false ,price = 412440 ))
        carList.add(Car(id= 4 ,car_picture = "renault_kaptur",name = "renault kaptur",availability = true ,price = 519620 ))
        carList.add(Car(id= 5 ,car_picture = "seat_ibiza",name = "seat ibiza",availability = true ,price = 91066 ))
        carList.add(Car(id= 6 ,car_picture = "seat_leon",name = "seat leon",availability = false ,price = 61033 ))


        carAdapter = CarAdapter(carList)
        recycler_view_car.adapter = carAdapter

        recycler_view_car.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL ,
            false)


        return rootView

       }
        catch (e: Exception) {
            Log.e(TAG, "onCreateView", e);
            throw e;
        }
    }
}