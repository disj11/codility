package com.codility.lesson.timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium;

    @BeforeEach
    void setUp() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] testcase, int expected) {
        assertEquals(expected, tapeEquilibrium.solution(testcase));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 4, 3}, 1)
        );
    }
}
