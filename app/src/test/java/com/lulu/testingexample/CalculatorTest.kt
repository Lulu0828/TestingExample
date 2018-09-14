package com.lulu.testingexample

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun sum() {
        assertEquals(6.0, calculator.sum(1.0, 5.0), 0.0)
    }

    @Test
    fun substract() {
        assertEquals(1.0, calculator.substract(5.0, 4.0), 0.0)
    }

    @Test
    fun divide() {
        assertEquals(4.0, calculator.divide(20.0, 5.0), 0.0)
    }

    @Test
    fun multiply() {
        assertEquals(10.0, calculator.multiply(2.0, 5.0), 0.0)
    }
}