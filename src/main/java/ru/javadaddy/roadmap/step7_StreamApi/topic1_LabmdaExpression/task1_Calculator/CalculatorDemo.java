package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task1_Calculator;

/**
 * Определите функциональный интерфейс Calculator с методом:
 * int operate(int a, int b)
 * В классе CalculatorDemo:
 * Реализуйте интерфейс с помощью лямбда-выражения, которое складывает два числа.
 * Вызовите метод operate() с заданными значениями и выведите результат.
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.operate(3, 5);
        System.out.println(result);
    }
}
