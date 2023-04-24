package com.example.loops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Loops()
    }

    private fun Loops()
    {
        val byList : List<String> = listOf("Cesar", "Reynoso.", "Martinez.")
        val byMap : MutableMap<Int, String> = mutableMapOf(1 to "El", 100 to "Vacio")


        for(byInt in byList)
        {
            println(byInt)
        }

        for(byMapInt in byMap)
        {
            println("${byMapInt.value}")
        }

        println("Las veces que ha quedado vacio son:")

        for(x in 1..10)
        {
            println(x)
        }

        println("If u see this u can get by me in:")

        for(x in 0 .. 100 step 10){
            println(x)
        }
        println("Years")
        println("to araise the big empty faliure:")
        for(x in 100 downTo 0 step 5 )
        {
            println(x)
        }

        println("")
        println("")
        println("")
        println("")
        println("")

        println("I Know, I´m Bored, sooo sorry")

        var x : Int = 0

        while(x <= 10){
            println(x)
            x++
        }

    }
}
