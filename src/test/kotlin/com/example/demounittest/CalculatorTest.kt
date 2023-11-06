package com.example.demounittest

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculatorTest {

    private val calculator: Calculator = Calculator()

    @Test
    fun plusOneAndTwoReturnThree() {
        val expect = 3
        val result = calculator.plus(1,2)
        assertEquals(expect,result)
    }

    @Test
    fun minusFourAndThreeReturnOne() {
        val expect = 1
        val result = calculator.minus(4,3)
        assertEquals(expect,result)
    }

    @Test
    fun multiplyTwoAndFiveReturnTen() {
        val expect = 10
        val result = calculator.multiply(2,5)
        assertEquals(expect,result)
    }

    @Test
    fun divideFifteenAndThreeReturnFive() {
        val expect = 5
        val result = calculator.divide(15,3)
        assertEquals(expect,result)
    }
}