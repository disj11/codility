package com.codility.lesson.iterations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {
    private BinaryGap binaryGap;

    @BeforeEach
    void setUp() {
        binaryGap = new BinaryGap();
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    void solution(int testcase, int expected) {
        assertEquals(expected, binaryGap.solution(testcase));
    }

    private static Stream<Arguments> provideSource() {
        return Stream.of(
                Arguments.of(9, 2),
                Arguments.of(529, 4)
        );
    }
}
