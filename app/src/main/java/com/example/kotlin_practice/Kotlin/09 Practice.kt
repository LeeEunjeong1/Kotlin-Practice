package com.example.kotlin_practice.Kotlin

fun main(){
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null){
        println("a is null")
    }else{
        println("a is not null")
    }

    if (b+c==110){
        println("b plus c equal 110")
    }else{
        println("b plus c is not 110")
    }

    //엘비스 연산자
    val number: Int? = 50
    val number2 = number ?: 10
    println()
    println(number2)
}