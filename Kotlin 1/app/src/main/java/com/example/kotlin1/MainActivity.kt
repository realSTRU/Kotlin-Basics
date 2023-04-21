package com.example.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VariablesYConstantes()
    }

    private fun VariablesYConstantes()
    {
        //First attempts..

        var myFirstVariable : String = "1"
        var myFirstStringVariable = "Cesar Jose Reynoso Martinez"

        println("Hola No."+myFirstVariable+":"+myFirstStringVariable)

    }
}