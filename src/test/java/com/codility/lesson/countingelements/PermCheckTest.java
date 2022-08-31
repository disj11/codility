package com.codility.lesson.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {
    private PermCheck permCheck;

    @BeforeEach
    void setUp() {
        permCheck = new PermCheck();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] testcase, int expected) {
        assertEquals(expected, permCheck.solution(testcase));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{4, 1, 3, 2}, 1),
                Arguments.of(new int[]{4, 1, 3}, 0)
        );
    }
}
