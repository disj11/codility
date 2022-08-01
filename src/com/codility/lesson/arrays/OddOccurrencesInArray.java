package com.codility.lesson.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!countMap.containsKey(A[i])) {
                countMap.put(A[i], 0);
            }

            countMap.put(A[i], countMap.get(A[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 9})); // 7
        System.out.println(new OddOccurrencesInArray().solution(new int[]{3, 3, 7, 7, 5, 8, 5})); // 8
    }
}
