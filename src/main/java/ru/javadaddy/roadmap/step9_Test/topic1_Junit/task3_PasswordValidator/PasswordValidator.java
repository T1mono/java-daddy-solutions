package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task3_PasswordValidator;

/**
 * Напишите тесты на различные случаи:
 * Пароль короче 8 символов
 * Пароль без цифр
 * Корректный пароль
 * Пустая строка
 * Найдите баг и исправьте его.
 */
public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Пароль не может быть null");
        }

        if (password.isBlank()) {
            throw new IllegalArgumentException("Пароль не может быть пустым или содержать только пробел");
        }

        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль не может быть меньше 8 символов");
        }

        if (!password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы однну цифру");
        }
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}
