package com.example.kotlin_practice.Kotlin

fun main(){
    val a: Int = 5
    val b: Int = 10
    //if/else 사용하는 방법
    if(a > b){
        println("a가 b보다 크다")
    } else{
        println("a가 b보다 작다")
    }
    //if/else 사용하는 방법2
    if(a>b){
        println("a가 b보다 크다")
    }
    //if/else/else if
    if(a>b){
        println("a가 b보다 크다")
    }else if(a<b){
        println("a가 b보다 작다")
    }else{
        println("a와 b가 같다")
    }
    //값을 return하는 if
    val max = if(a>b){
        a
    }else{
        b
    }
    println()
    println(max)

    val max2 = if(a>b) a else b
    println(max2)
}