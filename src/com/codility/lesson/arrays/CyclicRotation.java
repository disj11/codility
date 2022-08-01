package com.codility.lesson.arrays;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int [] A, int K) {
        int length = A.length;
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            int newIndex = (i + K) % length;
            newArr[newIndex] = A[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 3))); // [9, 7, 6, 3, 8]
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{1, 2, 3, 4}, 4))); // [1, 2, 3, 4]
    }
}
