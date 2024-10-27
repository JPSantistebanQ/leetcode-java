package com.jpsantq.leetcode.problems.basic.b_0001_two_sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
                Arguments.of(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
                Arguments.of(new int[] {3, 3}, 6, new int[] {0, 1}),
                Arguments.of(new int[] {3, 3}, 7, null)
        );
    }

    @ParameterizedTest(name = "Test {index} => nums={0}, target={1}, expected={2}")
    @MethodSource("provideArguments")
    @DisplayName("Test TwoSum.solution")
    void testSolution(int[] nums, int target, int[] expected) {
        int[] result = TwoSum.solution(nums, target);
        assertArrayEquals(expected, result);
    }

}