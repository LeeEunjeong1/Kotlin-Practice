package com.example.kotlin_practice.Kotlin

fun main(){
    //산술 연산자
    var a = 10+1
    var b = 10-1
    var c = 1+9
    var d = 20/3
    var e = 20%3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println()
    //대입 연산자
    val f = 5

    //복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    //증감 연산자
    a++
    b--
    println()
    println(a)
    println(b)
    println()

    //비교 연산자
    var g = a > b
    println(g)

}