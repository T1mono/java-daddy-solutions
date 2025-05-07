package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.operate(3, 5);
        System.out.println(result);
    }
}
