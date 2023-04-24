package com.example.aclass

class Programmer(var Name: String,var Level: String, var ExperienceAge: Int, var Languages: Array<Language> )
{

    enum class Language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT,
        CSHARP,
        RUBY
    }

    fun code()
    {
        for(lenguaje in Languages)
        {
            println("Estoy programando en $lenguaje")
        }
    }
}