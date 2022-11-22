package gradle.kotlin.latest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/*
Write a program that prints one line for each number from 1 to 100
For multiples of three print Fizz instead of the number
For the multiples of five print Buzz instead of the number
For numbers which are multiples of both three and five print FizzBuzz instead of the number

 */
class FizzBuzzTest {
    @Test
    fun `it prints 100 elements list`() {
        val fizzBuzzResult = FizzBuzz().printResult()
        assertThat(fizzBuzzResult.split("\n")).hasSize(100)
    }

    @Test
    fun `it prints Fizz for multiples of 3`() {
        val fizzBuzzResult = FizzBuzz().printResult()
        val multiplesOfThree = fizzBuzzResult.split("\n")
            .filterIndexed { index, _ -> index % 3 == 0 }
        assertThat(multiplesOfThree).containsOnly("Fizz")
    }
}
