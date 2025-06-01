package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task5_PalindromeChecker;

/**
 * Метод isPalindrome(String text) проверяет, является ли переданная строка палиндромом (читается одинаково в обе стороны).
 * Напишите тесты для различных случаев:
 * Обычные палиндромы (например, "madam")
 * Чувствительность к регистру
 * Строки с пробелами
 * Пустая строка
 * Найдите баг и предложите исправление.
 */
public class PalindromeChecker {

    public static boolean isPalindrome(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Полиндром не можеть быть пустым");
        }

        if (text.isBlank()) {
            throw new IllegalArgumentException("Полиндром не может быть пустым или содержать только пробелы");
        }

        if (text.matches(".*\\s.*")) {
            throw new IllegalArgumentException("В полиндроме не должно быть пробелов");
        }

        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
