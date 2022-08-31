package com.codility.lesson.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeEach
    void setUp() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void solution(int[] testcase, int expected) {
        assertEquals(expected, oddOccurrencesInArray.solution(testcase));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{9, 3, 9, 3, 9, 7, 9}, 7),
                Arguments.of(new int[]{3, 3, 7, 7, 5, 8, 5}, 8)
        );
    }
}
