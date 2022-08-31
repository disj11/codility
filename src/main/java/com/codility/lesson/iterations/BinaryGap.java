package com.codility.lesson.iterations;

public class BinaryGap {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int maxGap = 0;
        int gap = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                maxGap = Math.max(maxGap, gap);
                gap = 0;
            } else {
                gap++;
            }
        }

        return maxGap;
    }
}
