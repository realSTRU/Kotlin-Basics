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

        //ints (Byte, Short, Int, Long)

        val byInt : Int = 1
        val byInt2 = 9

        val byInt3 : Int = byInt + byInt2

        println("El numero resultante de la suma de " + byInt +" mas "+ byInt2 +" es: "+  byInt3)

        //Decimals (Float, Double)

        val byDouble :Double = 2.10
        val byDouble1 : Double = 3.7
        val byDouble2 : Double = 8.9

        val byDouble3 : Double = byDouble + byDouble1 + byDouble2

        println("El resultado de sumar los numero decimales en kotlin de los numeros ("+byDouble+" "+byDouble1+" "+byDouble2+") es: "+byDouble3)

        // Boolean (Boolean)

        val byBoolean : Boolean = true
        val byBoolean1 : Boolean = false

        println(byBoolean != byBoolean1)
        

    }
}

