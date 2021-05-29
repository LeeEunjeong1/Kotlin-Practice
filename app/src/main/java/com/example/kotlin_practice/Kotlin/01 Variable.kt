package com.example.kotlin_practice.Kotlin

//Variable -> 마음대로 원하는 것을 넣을 수 있음
//Value -> 한 번 넣으면 바꿀 수 없음

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(){
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "GoodBye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)
}