package com.codility.lesson.prefixsums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassingCarsTest {
    private PassingCars passingCars;

    @BeforeEach
    void setUp() {
        passingCars = new PassingCars();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] cars, int expected) {
        assertEquals(expected, passingCars.solution(cars));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 1, 1}, 5),
                Arguments.of(new int[]{1, 1, 0, 1}, 1)
        );
    }
}
