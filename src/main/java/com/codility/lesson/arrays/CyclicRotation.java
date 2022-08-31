package com.codility.lesson.arrays;

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
}
