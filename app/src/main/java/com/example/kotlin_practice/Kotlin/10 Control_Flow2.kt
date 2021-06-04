package com.example.kotlin_practice.Kotlin

//when -> 흐름을 제어할때, 값을 리턴할때 사용
fun main(){
    val value: Int = 3

    when (value){
        1-> println("value is 1")
        2-> println("value is 2")
        3-> println("value is 3")
        else -> println("I do not know value")
    }

    if (value == 1) println("value is 1")
    else if (value==2) println("value is 2")
    else if (value==3) println("value is 3")
    else println("I do not know value")

    val value2 = when (value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100

    }
    println(value2)
}