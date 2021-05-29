package com.example.kotlin_practice.Kotlin

//fun 함수명 (변수명: 타입, 변수명:타입 ...) : 반환형 {
//  함수 내용
//  return 반환값
// }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

//디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit { //Unit 생략 가능
    val result: Int = first + second
    println(result)
}

//간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second
//가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int){
    for(number in numbers){
        println(number)
    }
}
fun main() {
    val result = plus(5, 10) // ctrl+p로 확인 가능
    println(result)
    val result2 = plusFive(10)
    println(result2)
    printPlus(10, 20)
    val result3 = plusShort(50, 50)
    println(result3)
    plusMany(1,2,3,4,5,6)
}