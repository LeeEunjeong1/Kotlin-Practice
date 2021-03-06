package com.example.kotlin_practice.Kotlin

fun main(){
    val value: Int? = null

    when (value){
        null -> println("value isnull")
        else -> println("value is not null")
    }

    val value2: Boolean? = null
    //when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when(value2){
        true -> println("")
        false -> println("")
        null ->  println("")
    }

    //값을 리턴하는 when 구문일 경우 반드시 값을 리턴해야 한다
    val value3 = when(value2){
        true -> 1
        false -> 3
        null -> 4 //or else -> 4
    }

    val value4: Int = 10
    when (value4){
        is Int ->{
            println("value4 is int")
        }
        else -> {
            println("value4 is not int")

        }
    }

    //when의 다양한 조건식 (2)
    val value5: Int = 87
    when (value5){
        in 60..70 ->{
            println("value5 is in 60-70")

        }
        in 70..80 ->{
            println("value5 is in 70-80")

        }
        in 80..90 ->{
            println("value5 is in 80-90")

        }
    }
}