package com.codility.lesson.timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jumpCount = (Y - X) / D;
        int remainDistance = (Y - X) % D;

        return remainDistance > 0 ? jumpCount + 1 : jumpCount;
    }
}
