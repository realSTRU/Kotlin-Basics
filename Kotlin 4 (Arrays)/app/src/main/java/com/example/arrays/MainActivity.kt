package com.example.arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //String Array
        ArrayImplementation()

        //Int Array
        ArrayInt()

        //Posible operations with arrays
        /*
        Array.count()
        Array.clear()

        and sort facts, u can use

        */
    }


    private fun ArrayImplementation()
    {
        val name ="Cesar"
        val surname = "Reynoso"
        val company = "Martinez"
        val age = "19"

        val byArray : ArrayList<String> = arrayListOf<String>()


        byArray.add(name)
        byArray.add(surname)
        byArray.add(company)
        byArray.add(age)

        byArray.addAll((listOf("Basketball", "Programming", "Shooters")))

        byArray[6] ="Shooters and Anime"

        println(byArray)

        byArray.forEach {
            println(it)
        }
    }

    private fun ArrayInt()
    {
        var byInt : Int = 3
        var byInt2 : Int = 6
        var byInt23 : Int = 9


        val byIntArray : ArrayList<Int> = arrayListOf<Int>()

        byIntArray.add(byInt)
        byIntArray.add(byInt2)
        byIntArray.add(byInt23)

        println(byIntArray)
    }
}