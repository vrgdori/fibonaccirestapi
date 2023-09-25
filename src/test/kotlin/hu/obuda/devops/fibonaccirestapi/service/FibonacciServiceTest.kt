package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    // TODO - Test with greater numbers and test edge cases
    @Test
    fun shouldReturn0WhenCall2() {
        // given

        // when
        val result: Int = underTest.fibonacci(2)
        // then
        Assertions.assertEquals(1, result)
    }
    @Test
    fun shouldReturn0WhenCall3() {
        // given

        // when
        val result: Int = underTest.fibonacci(3)
        // then
        Assertions.assertEquals(2, result)
    }
    @Test
    fun shouldReturn0WhenCall4() {
        // given

        // when
        val result: Int = underTest.fibonacci(4)
        // then
        Assertions.assertEquals(3, result)
    }
    @Test
    fun shouldReturn0WhenCall5() {
        // given

        // when
        val result: Int = underTest.fibonacci(5)
        // then
        Assertions.assertEquals(5, result)
    }
    @Test
    fun shouldReturn0WhenCall6() {
        // given

        // when
        val result: Int = underTest.fibonacci(6)
        // then
        Assertions.assertEquals(8, result)
    }
}