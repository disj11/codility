package com.codility.lesson.countingelements;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int lastMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1] = Math.max(lastMax, counters[A[i] - 1]) + 1;
                max = Math.max (max, counters[A[i] - 1]);
            } else {
                lastMax = max;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastMax);
        }

        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}))); // {3, 2, 2, 4, 2};
    }
}
