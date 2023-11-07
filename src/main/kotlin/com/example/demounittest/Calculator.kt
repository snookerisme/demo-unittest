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

    fun loop(number1:Int,number2: Int):Int{
        var result = 0;
        var i = 0;
        while (i < number1){
            result += number2
            ++i
        }
        return result
    }
}

fun main(){
    val calculator = Calculator()
    val result = calculator.loop(4,1)
    println("Result => $result")
}