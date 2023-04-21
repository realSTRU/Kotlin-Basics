package com.example.ifsentence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //leccion 1 about if sentence.
        //ifSentences()

        //leccion 2 about if sentence
        ifSentencePart2()

    }

    private fun ifSentences()
    {
        val byNumber = 1
        val byNumber2 = 3




        if(byNumber > byNumber2)
        {
            println("El numero 1 es mayor que el numero  2")
        }
        else
        {
            println("el numero 1 menor que el numero 2")
        }
    }
    private fun ifSentencePart2()
    {

    }
}