package com.example.kotlin_practice.Kotlin

fun main(){
    val value: Int = 3

    when (value){
        1-> {
            println("value is 1")
        }
        2-> {
            println("value is 2")
        }
        3-> {
            println("value is 3")
        }
        else -> println("I do not know value")
    }
}