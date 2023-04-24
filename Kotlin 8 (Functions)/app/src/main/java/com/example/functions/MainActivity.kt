package com.example.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        functions()
    }

    private fun functions()
    {
        saySome()
        saySome()
        saySome()
        var num : Int
        num = sumTwoNumbers(4,3)
        saySomething("GerDvis","Ryan Garcia", num)
    }

    private fun saySome()
    {
        println("Some")
    }

    private fun saySomething(beat1: String, beat2: String, round: Int)
    {
        println("TANK:$beat1 beat the bit shitTalker shitSkinny:$beat2 at Round number.$round")
    }

    fun sumTwoNumbers( num1: Int, num2: Int) : Int
    {
        var sum = num1 + num2
        return sum
    }

}