package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task1_DivisionCalculator;

/**
 *
 */
public class DivisionCalculator {
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Делеть на ноль нельзя");
        }
        return (double) a / b;
    }
}
