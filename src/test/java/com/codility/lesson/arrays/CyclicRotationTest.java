package com.codility.lesson.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @BeforeEach
    void setUp() {
        cyclicRotation = new CyclicRotation();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] a, int k, int[] expected) {
        assertArrayEquals(expected, cyclicRotation.solution(a, k));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8}),
                Arguments.of(new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4})
        );
    }
}
