package com.codility.lesson.countingelements;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean[] arr = new boolean[X + 1];
        int current = 0;

        for (int i = 0; i < A.length; i++) {
            int leafX = A[i];
            if (leafX < arr.length) {
                arr[leafX] = true;
            }

            while (current + 1 < arr.length && arr[current + 1]) {
                current++;
            }

            if (current == X) {
                return i;
            }
        }

        return -1;
    }
}
