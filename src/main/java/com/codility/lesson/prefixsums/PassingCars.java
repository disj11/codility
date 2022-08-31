package com.codility.lesson.prefixsums;

public class PassingCars {
    private static final int MAX = 1_000_000_000;

    public int solution(int[] A) {
        int zeros = 0;
        int carPasses = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeros++;
            } else if (A[i] == 1) {
                if (carPasses + zeros > MAX) {
                    return -1;
                }
                carPasses += zeros;
            }
        }

        return carPasses;
    }
}
