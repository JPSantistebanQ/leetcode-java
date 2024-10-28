package com.jpsantq.leetcode.problems.basic.b_0013_roman_to_integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("I", 1)
        );
    }

    @ParameterizedTest(name = "Test {index} => roman={0}, expected={1}")
    @MethodSource("provideArguments")
    @DisplayName("Test RomanToInteger.romanToInt")
    void testRomanToInt(String roman, int expected) {
        int result = RomanToInteger.romanToInt(roman);
        assertEquals(expected, result);
    }

}