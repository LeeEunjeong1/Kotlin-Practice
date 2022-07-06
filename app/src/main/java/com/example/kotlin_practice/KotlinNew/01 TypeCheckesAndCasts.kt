package com.example.kotlin_practice.KotlinNew

fun main(){

    val obj = 123
    val x = "hello"
    demo(obj,x)
}


fun demo(obj: Any, x: Any){

    if(obj is String){
        println(obj.length)
    }else{
        println("$obj is not a String")
    }

    if(x is String && x.length >0){
        println(x.length)
    }

    when(x){
        is Int -> print(x+1)
        is String -> print(x.length+1)
        is IntArray -> print(x.sum())
    }


}