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
}
