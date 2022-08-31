package com.codility.lesson.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxCountersTest {
    private MaxCounters maxCounters;

    @BeforeEach
    void setUp() {
        maxCounters = new MaxCounters();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int n, int[] a, int[] expected) {
        assertArrayEquals(expected, maxCounters.solution(n, a));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(5, new int[]{3, 4, 4, 6, 1, 4, 4}, new int[]{3, 2, 2, 4, 2})
        );
    }
}
