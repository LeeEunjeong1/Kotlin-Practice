package com.example.kotlin_practice.KotlinNew


fun main(){
    val one = 1 //Int
    val threeBillion = 3000000000 //Long
    val oneLong = 1L //Long
    val oneByte: Byte = 1
    val pi = 3.14 //Double

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(one)
    println(threeBillion)
    println(oneLong)
    println(oneByte)
    println(1+2)
    println(3.14*2.71)
    println("--------------------------")

    // String literals
    val text = """
        for (c in "foo")
            print(c)
    """.trimIndent()
    val text2 = """
        for (c in "foo")
            print(c)
    """.trimMargin()

    println(text)
    println(text2)

    println("--------------------------")

    // String templates
    val i = 10
    println("i = $i")
    val s = "abc"
    println("$s.length is ${s.length}")
    val price = """
        ${'$'}_9.99
    """
    println(price)
}