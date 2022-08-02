package com.codility.lesson.countingelements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> positiveIntegers = new HashSet<>();
        for (int num : A) {
            if (num > 0) {
                positiveIntegers.add(num);
            }
        }

        int min = 1;
        while (positiveIntegers.contains(min)) {
            min++;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2})); // 5
        System.out.println(new MissingInteger().solution(new int[]{1, 2, 3})); // 4
        System.out.println(new MissingInteger().solution(new int[]{-1, -2})); // 1
        System.out.println(new MissingInteger().solution(new int[]{4, 5, 6, 2})); // 1
    }
}
