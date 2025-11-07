package com.example.fitnessapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun substraction_isCorrect(){
        assertEquals(2, 7-5)
    }
    @Test
    fun multiply_isCorrect(){
        assertEquals(8, 4*2)
    }
    @Test
    fun divide_isCorrect(){
        assertEquals(4,20/5)
    }
}