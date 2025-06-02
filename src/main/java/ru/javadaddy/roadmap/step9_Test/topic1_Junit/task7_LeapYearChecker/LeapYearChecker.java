package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task7_LeapYearChecker;

/**
 * Метод isLeapYear(int year) проверяет, является ли год високосным.
 * <p>
 * Напишите тесты на разные случаи:
 * Год, кратный 4
 * Год, кратный 100, но не 400
 * Год, кратный 400
 * Обычный невисокосный год
 * Найдите баг и исправьте его.
 */
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
