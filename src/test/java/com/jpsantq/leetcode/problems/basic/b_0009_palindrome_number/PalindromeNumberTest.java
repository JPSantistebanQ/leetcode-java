package com.jpsantq.leetcode.problems.basic.b_0009_palindrome_number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false),
                Arguments.of(-101, false),
                Arguments.of(0, true)
        );
    }

    @ParameterizedTest(name = "Test {index} => x={0}, expected={1}")
    @MethodSource("provideArguments")
    @DisplayName("Test PalindromeNumber.isPalindrome")
    void testIsPalindrome(int x, boolean expected) {
        boolean result = PalindromeNumber.isPalindrome(x);
        assertEquals(expected, result);
    }

}