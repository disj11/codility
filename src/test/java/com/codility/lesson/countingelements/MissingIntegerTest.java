package com.codility.lesson.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {
    private MissingInteger missingInteger;

    @BeforeEach
    void setUp() {
        missingInteger = new MissingInteger();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] testcase, int expected) {
        assertEquals(expected, missingInteger.solution(testcase));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5),
                Arguments.of(new int[]{1, 2, 3}, 4),
                Arguments.of(new int[]{-1, -2}, 1),
                Arguments.of(new int[]{4, 5, 6, 2}, 1)
        );
    }
}
