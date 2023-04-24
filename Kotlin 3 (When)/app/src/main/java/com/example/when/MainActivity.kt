package com.example.`when`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //When With String
        //Whenn()

        //When With Integers
        WhenWInt()
    }

    private fun Whenn()
    {
        val country = "Dominican"

        when (country)
        {
            "Dominican Republic" -> {
                println("El idioma es Español alterado ;)  :p")
            }
            "Colombia" -> {
                println("El idioma es español posiblemente neutro")
            }
            else -> {
                println("No conozco el idioma")
            }
        }
    }

    private fun WhenWInt()
    {
        val age = 18
        when(age)
        {
            in 1 .. 17 ->{
                println("Eres menor de edad")
            }
            in 18..100 -> {
                println("Eres mayor de edad")
            }
            else -> {
                println("Edad no validad la edad debe de comprender entre 1 y 100")
            }
        }
    }
}
