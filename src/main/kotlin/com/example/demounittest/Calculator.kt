package com.example.demounittest

class Calculator {
    fun plus(number1:Int,number2: Int): Int{
        return number1.plus(number2)
    }

    fun minus(number1:Int,number2: Int): Int{
        return number1.minus(number2)
    }

    fun multiply(number1:Int,number2: Int): Int{
        return number1 * number2
    }

    fun divide(number1:Int,number2: Int): Int{
        return number1/number2
    }
}

fun main(){
    val calculator = Calculator()
    val result = calculator.plus(1,4)
    println("Result => $result")
}