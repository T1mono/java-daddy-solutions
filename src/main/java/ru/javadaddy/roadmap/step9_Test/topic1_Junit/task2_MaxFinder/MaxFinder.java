package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task2_MaxFinder;

public class MaxFinder {
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
