package com.codility.lesson.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1;
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2, 3, 1, 5})); // 4
        System.out.println(new PermMissingElem().solution(new int[]{2})); // 1
        System.out.println(new PermMissingElem().solution(new int[]{1, 3})); // 2
        System.out.println(new PermMissingElem().solution(new int[]{2, 3})); // 1
        System.out.println(new PermMissingElem().solution(new int[]{})); // 1
        System.out.println(new PermMissingElem().solution(new int[]{1, 2})); // 3
    }
}
