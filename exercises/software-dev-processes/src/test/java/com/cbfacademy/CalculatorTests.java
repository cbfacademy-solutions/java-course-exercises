package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @ParameterizedTest
    @CsvSource({
        "2, 4, 6",
        "-3, -5, -8",
        "0, 0, 0",
        "7, 0, 7",
        "-7, 0, -7",
        "-3, 3, 0",
        "3, -6, -3",
        "-4, 5, 1"
    })
    @DisplayName("add two numbers")
    public void testAddition(final int firstInput, final int secondInput, final int expectedResult) {
        final Integer sum = Calculator.add(firstInput, secondInput);

        assertEquals(expectedResult, sum);
    }

    @ParameterizedTest
    @CsvSource({
        "2, 4, -2",
        "4, 2, 2",
        "-5, -3, -2",
        "5, 5, 0",
        "0, 0, 0",
        "0, 7, -7",
        "7, 0, 7",
        "-7, -7, 0",
        "3, -6, 9",
        "-4, 5, -9"
    })
    @DisplayName("subtract two numbers")
    public void testSubtraction(final int firstInput, final int secondInput, final int expectedResult) {
        final Integer difference = Calculator.subtract(firstInput, secondInput);

        assertEquals(expectedResult, difference);
    }

    @ParameterizedTest
    @CsvSource({
        "2, 4, 8",
        "-3, -5, 15",
        "0, 0, 0",
        "7, 0, 0",
        "-7, 0, 0",
        "-3, 3, -9",
        "3, -6, -18",
        "-4, 5, -20"
    })
    @DisplayName("multiply two numbers")
    public void testMultiplication(final int firstInput, final int secondInput, final int expectedResult) {
        final Integer product = Calculator.multiply(firstInput, secondInput);

        assertEquals(expectedResult, product);
    }

    @ParameterizedTest
    @CsvSource({
            "24, 4, 6",
            "4, 2, 2",
            "5, 5, 1",
            "35, 5, 7",
            "99, 9, 11",
            "-64, -8, 8",
            "-120, 20, -6",
            "0, 1, 0",
            "100, -10, -10",
            "1000000, 1000, 1000"
    })
    @DisplayName("divide two numbers")
    public void testDivision(final int firstInput, final int secondInput, final int expectedResult) {
        final Integer quotient = Calculator.divide(firstInput, secondInput);

        assertEquals(expectedResult, quotient);
    }

    @Test
    @DisplayName("divide by zero throws exception")
    public void divideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(5, 0);
        });
    }
}
