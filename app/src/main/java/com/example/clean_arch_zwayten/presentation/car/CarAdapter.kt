package com.example.clean_arch_zwayten.presentation.car

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.clean_arch_zwayten.R
import com.example.clean_arch_zwayten.data.repository.CarRepositoryImp
import com.example.clean_arch_zwayten.data.source.local.dao.CarDao
import com.example.clean_arch_zwayten.di.AppModule
import com.example.clean_arch_zwayten.domain.model.Car
import com.example.clean_arch_zwayten.domain.repository.CarRepository
import com.example.clean_arch_zwayten.domain.usecase.car.AddToFavorite
import dagger.Component
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CarAdapter ( val carList: MutableList<Car>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

@Inject


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.holder_car, parent, false)
        return CarViewHolder(view)
    }

    private fun getItem(position: Int): Car{
        return carList[position]
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {

        val name = carList[position].name
        val availability = carList[position].availability
        val carPic = carList[position].car_picture
        val price = carList[position].price

        val image_identifier = holder.itemView.context.getResources().getIdentifier("drawable/" + carPic, null, holder.itemView.context.getPackageName());
        holder.carpic.setImageResource(image_identifier)
        holder.name.text = name
        holder.price.text = price.toString()
        if(availability){
            holder.availability.text = "Available"
        } else { holder.availability.text = "Not-Available"}

        holder.btnLike.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Car added to Favorite list", Toast.LENGTH_SHORT).show()
            val tmp = getItem(position).toEntity()


        }
    }

    override fun getItemCount(): Int {
        return carList.size
    }


    inner class CarViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val carpic = itemView.findViewById<ImageView>(R.id.carPic)
        val name = itemView.findViewById<TextView>(R.id.name)
        val availability = itemView.findViewById<TextView>(R.id.availability)
        val price = itemView.findViewById<TextView>(R.id.price)
        val btnLike = itemView.findViewById<ImageButton>(R.id.btnLike)
    }
}