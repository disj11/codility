package com.codility.lesson.timecomplexity;

public class TapeEquilibrium {
//    시간 초과
//    public int solution(int[] A) {
//        int sumA = A[0];
//        int sumB = Arrays.stream(A).sum() - A[0];
//
//        int min = Math.abs(sumA - sumB);
//        for (int i = 1; i < A.length - 1; i++) {
//            sumA += A[i];
//            sumB -= A[i];
//            min = Math.min(min, Math.abs(sumA - sumB));
//        }
//        return min;
//    }

    public int solution(int[] A) {
        int[] sumArr = new int[A.length];
        sumArr[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            sumArr[i] = sumArr[i - 1] + A[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int sumA = sumArr[i];
            int sumB = sumArr[A.length - 1] - sumA;
            min = Math.min(min, Math.abs(sumA - sumB));
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3}));
    }
}
