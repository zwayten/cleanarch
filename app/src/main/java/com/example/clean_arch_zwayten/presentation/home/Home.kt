package com.example.clean_arch_zwayten.presentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.clean_arch_zwayten.R
import com.example.clean_arch_zwayten.presentation.car.CarFragment
import dagger.hilt.android.AndroidEntryPoint


class Home : AppCompatActivity() {

    lateinit var carList_button: Button
    lateinit var favorite_button: Button
    lateinit var profile_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        navigateToCarsPage()

        carList_button = findViewById<Button>(R.id.carList_button)
        favorite_button = findViewById<Button>(R.id.favorite_button)
        profile_button = findViewById<Button>(R.id.profile_button)

        //carList_button.setOnClickListener { println("hellllo0") }

        carList_button.setOnClickListener { navigateToCarsPage() }
        favorite_button.setOnClickListener { println("hellllo1") }
        profile_button.setOnClickListener { println("hellllo2") }
    }

    private fun navigateToCarsPage(){
        supportFragmentManager.beginTransaction().replace(R.id.main_container,CarFragment()).commit()
    }
}