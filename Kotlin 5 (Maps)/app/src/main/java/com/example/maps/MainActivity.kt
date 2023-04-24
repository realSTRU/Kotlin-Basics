package com.example.maps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Maps()
    }



    private fun Maps(){

        var byMap : Map<String, Int> = mapOf()

        byMap = mutableMapOf("Gabimaru el vacio" to 3, "Sukuna" to 6, "GerDvis" to 9)

        byMap["Ana"] = 7
        byMap.put("Cesar-No-Desk-Chan", 10)

        byMap.put("Cesar-No-Desk-Chan", 999)

        byMap.remove("Ana")
        println(byMap)




    }
}