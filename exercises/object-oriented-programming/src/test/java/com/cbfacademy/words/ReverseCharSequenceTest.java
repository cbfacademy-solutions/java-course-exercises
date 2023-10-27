package com.cbfacademy.words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseCharSequenceTest {
    @ParameterizedTest
    @MethodSource("lengthProvider")
    @DisplayName("returns the length of the given word")
    public void returnsTheLengthOfTheString(String word, int expected) {
        final ReverseCharSequence reverseChar = new ReverseCharSequence(word);

        final int result = reverseChar.length();

        assertThat(result, is(expected));
    }

    @ParameterizedTest
    @MethodSource("charAtProvider")
    @DisplayName("returns the character at the target position in a reversed word")
    public void returnsTheCharacterAtTheTargetPositionInAReversedString(String word, int index, char character) {
        final ReverseCharSequence reverseChar = new ReverseCharSequence(word);

        final char result = reverseChar.charAt(index);

        assertThat(result, is(character));
    }

    @ParameterizedTest
    @MethodSource("subSequenceProvider")
    @DisplayName("returns a sub string of the original word")
    public void returnsASubStringOfTheOriginalText(String word, int start, int end, int expected) {
        final ReverseCharSequence reverseChar = new ReverseCharSequence(word);

        final CharSequence result = reverseChar.subSequence(start, end);

        assertNotNull(result);
        assertThat(result.length(), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("reversedStringProvider")
    @DisplayName("returns the reversed string")
    public void returnsTheReversedString(String text, String expected) {
        final ReverseCharSequence reverseChar = new ReverseCharSequence(text);

        final String result = reverseChar.toString();

        assertThat(result, is(expected));
    }

    private static Stream<Arguments> lengthProvider() {
        return Stream.of(
                arguments("hello", 5),
                arguments("hi", 2),
                arguments("supercalifragilisticexpialidocious", 34),
                arguments("electroencephalographically", 27),
                arguments("explanation", 11));
    }

    private static Stream<Arguments> charAtProvider() {
        return Stream.of(
                arguments("hello", 3, 'e'),
                arguments("hi", 0, 'i'),
                arguments("superb", 4, 'u'),
                arguments("electrical", 5, 't'),
                arguments("Pneumonoultramicroscopicsilicovolcanoconiosis", 18, 'l'));
    }

    private static Stream<Arguments> subSequenceProvider() {
        return Stream.of(
                arguments("hello", 3, 4, 1),
                arguments("holiday", 2, 6, 4),
                arguments("terminated", 0, 3, 3));

    }

    private static Stream<Arguments> reversedStringProvider() {
        return Stream.of(
                arguments("hello", "olleh"),
                arguments("waterfall", "llafretaw"),
                arguments("dancing", "gnicnad"),
                arguments("facilitator", "rotatilicaf"),
                arguments("hey", "yeh"));
    }
}
