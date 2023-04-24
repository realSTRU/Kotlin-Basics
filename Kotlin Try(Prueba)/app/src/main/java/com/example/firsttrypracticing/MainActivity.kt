package com.example.firsttrypracticing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

class MainActivity() : AppCompatActivity() {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OnCreateApp()
    }

    private fun OnCreateApp(){

        var byInt1 : Int = 23
        var byInt2 : Int = 33
        var byInt3 : Int = byInt1 + byInt2

        println("la suma de los numeros $byInt1 + $byInt2 = $byInt3")
    }


}