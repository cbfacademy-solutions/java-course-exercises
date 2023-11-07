package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName(value = "Flow Control Exercises")
public class FlowControlExercisesTest {
    @ParameterizedTest
    @MethodSource("fizzBuzzExerciseProvider")
    @DisplayName("Fizz Buzz")
    public void fizzBuzz(List<Integer> numbers, List<String> expected) {
        final FlowControlExercises exercise = new FlowControlExercises();

        final List<String> result = exercise.fizzBuzz(numbers);

        assertThat(result.size(), is(expected.size()));
        assertThat(result, is(expected));
    }

    @ParameterizedTest
    @MethodSource("monthExerciseProvider")
    @DisplayName("Months")
    public void months(Integer number, String expected) {
        final FlowControlExercises exercise = new FlowControlExercises();

        final String result = exercise.whichMonth(number);

        assertThat(result, is(expected));
    }

    @Test
    @DisplayName("Odd and Even Numbers")
    public void oddAndEvenNumbers() {
        final FlowControlExercises exercise = new FlowControlExercises();

        final Map<String, Integer> result = exercise.sumOfOddsAndSumOfEvens();

        final Set<String> keys = result.keySet();
        assertThat(result.size(), is(2));
        assertThat(keys.contains("SumOfEvens"), is(true));
        assertThat(keys.contains("SumOfOdds"), is(true));
        assertThat(result.get("SumOfEvens"), is(2550));
        assertThat(result.get("SumOfOdds"), is(2500));
    }

    static Stream<Arguments> fizzBuzzExerciseProvider() {
        return Stream.of(
                arguments(List.of(1, 2, 4, 7, 8, 11, 13, 17), List.of("1", "2", "4", "7", "8", "11", "13", "17")),
                arguments(List.of(1, 2, 3, 5, 9, 15, 21, 30, 35),
                        List.of("1", "2", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "FizzBuzz", "Buzz")),
                arguments(List.of(3, 5, 15, 18, 20, 30),
                        List.of("Fizz", "Buzz", "FizzBuzz", "Fizz", "Buzz", "FizzBuzz")),
                arguments(List.of(213, 54, 91, 187, 2001, 2023), List.of("Fizz", "Fizz", "91", "187", "Fizz", "2023")));
    }

    static Stream<Arguments> monthExerciseProvider() {
        return Stream.of(
                arguments(17, "Invalid month number"),
                arguments(0, "Invalid month number"),
                arguments(4, "April"),
                arguments(1, "January"));
    }
}
