package com.example.tiposdedatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tiposDeDatos()
    }

    private fun tiposDeDatos()
    {
        //String
        val myString1 = "Hola!"
        val myString2 =  "Mi nombre es Cesar!"
        val myString3 = "Estoy intentando programar en kotlin"

        println(myString1 + " " + myString2 + " "+ "y" + " " + myString3)

    }
}

