package com.example.kotlin_practice.Kotlin

fun main(){

    //배열 생성(1)
    var number: Int = 10
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    //배열 생성(2)
    var number1 = 10
    var group2 = arrayOf(1,2,3.5,"Hello")

    //index는 순서, 0부터 시작
    //배열 꺼내기(1)
    val test1 = group1.get(0)
    println(test1)

    //배열 꺼내기(2)
    val test2 = group1[0]
    println(test2)

    //배열 값 바꾸기(1)
    group1.set(0, 100)
    println(group1[0])

    //배열 값 바꾸기(2)
    group1[0] = 200


}