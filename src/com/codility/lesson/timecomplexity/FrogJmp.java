package com.codility.lesson.timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jumpCount = (Y - X) / D;
        int remainDistance = (Y - X) % D;

        return remainDistance > 0 ? jumpCount + 1 : jumpCount;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30)); // 3
        System.out.println(new FrogJmp().solution(10, 10, 30)); // 0
        System.out.println(new FrogJmp().solution(0, 30, 30)); // 1
        System.out.println(new FrogJmp().solution(0, 31, 30)); // 2
    }
}
