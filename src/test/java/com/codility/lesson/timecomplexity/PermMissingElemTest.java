package com.codility.lesson.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElemTest {
    private PermMissingElem permMissingElem;

    @BeforeEach
    void setUp() {
        permMissingElem = new PermMissingElem();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] testcase, int expected) {
        assertEquals(expected, permMissingElem.solution(testcase));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 5}, 4),
                Arguments.of(new int[]{2}, 1),
                Arguments.of(new int[]{1, 3}, 2),
                Arguments.of(new int[]{2, 3}, 1),
                Arguments.of(new int[]{}, 1),
                Arguments.of(new int[]{1, 2}, 3)
        );
    }
}
