package com.example.mysafetystring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StringEmpties()
    }

    private fun StringEmpties()
    {
        var byMyName : String? = "GerDvis"

        println(byMyName?.length)

        byMyName.let {
            println(byMyName)
        } ?: run{
            println(byMyName)
        }
    }
}