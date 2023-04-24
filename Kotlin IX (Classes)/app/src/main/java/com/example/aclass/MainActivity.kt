package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        classProgrammer()
    }


    fun classProgrammer()
    {
        var  UnknownPro = Programmer("Cesar", "Senior", 3, arrayOf(Programmer.Language.CSHARP,Programmer.Language.RUBY,
            Programmer.Language.KOTLIN, Programmer.Language.JAVASCRIPT) )

        println("${UnknownPro.Name} es un ${UnknownPro.Level} con un tiempo de experiencia de programacion de " +
                "${UnknownPro.ExperienceAge}")
        UnknownPro.code()
    }
}