package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task6_DigitSumCalculator;


/**
 * Метод sumDigits(int number) вычисляет сумму цифр числа.
 *
 * Напишите тесты на разные случаи:
 * Однозначное число
 * Многозначное число
 * Отрицательные числа
 * Число 0
 * Найдите баг и исправьте его.
 */
public class DigitSumCalculator {
    public static int sumDigits(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }

        String numStr = String.valueOf(number);
        int sum = 0;
        for (char digit : numStr.toCharArray()) {
            sum += digit - '0';
        }
        return sum;
    }
}
