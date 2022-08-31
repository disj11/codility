package com.codility.lesson.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJmpTest {
    private FrogJmp frogJmp;

    @BeforeEach
    void setUp() {
        frogJmp = new FrogJmp();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int x, int y, int d, int expected) {
        assertEquals(expected, frogJmp.solution(x, y, d));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(10, 85, 30, 3),
                Arguments.of(10, 10, 30, 0),
                Arguments.of(0, 30, 30, 1),
                Arguments.of(0, 31, 30, 2)
        );
    }
}
