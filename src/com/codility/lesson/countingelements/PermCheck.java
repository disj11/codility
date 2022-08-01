package com.codility.lesson.countingelements;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new PermCheck().solution(new int[]{4, 1, 3, 2})); // 1
        System.out.println(new PermCheck().solution(new int[]{4, 1, 3})); // 0
    }
}
