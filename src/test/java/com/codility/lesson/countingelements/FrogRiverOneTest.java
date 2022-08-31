package com.codility.lesson.countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @BeforeEach
    void setUp() {
        frogRiverOne = new FrogRiverOne();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int x, int[] a, int expected) {
        assertEquals(expected, frogRiverOne.solution(x, a));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 6),
                Arguments.of(4, new int[]{1, 2, 1, 4, 2, 3, 5, 4}, 5)
        );
    }
}
