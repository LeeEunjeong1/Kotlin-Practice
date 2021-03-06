package com.example.kotlin_practice.Kotlin

fun main(){
    val array = arrayOf<Int>(1,2,3)

    //get,set
    val number = array.get(0)
    println(number)

    // val number1 = array.get(100) // 인덱스에 주의 해야 한다

    array.set(0,100)
    val number2 = array.get(0)
    println(number2)

    array.set(100, 100)

    //Array 의 bounds
    // - 처음 만들때 결정된다

    //Array를 만드는 방법(3)
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b','c') // char ->'', string->""
    val a3 = booleanArrayOf(true,false,true)
    val a4 = doubleArrayOf(1.2,100.345)

    //Araay를 만드는 방법(4) -> lambda를 활용한 방법
    var a5 = Array(10,{0})
    var a6 = Array(5,{1;2;3;4;5})
}