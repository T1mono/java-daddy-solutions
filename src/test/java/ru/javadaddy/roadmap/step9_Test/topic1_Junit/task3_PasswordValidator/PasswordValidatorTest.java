package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task3_PasswordValidator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testIsValidShorterEightCharacters() {
        String password = "Gs2234a";
        assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.isValid(password),
                "Пароль из 7 символов должен вызвать исключение"
        );
    }

    @Test
    @DisplayName("Проверка валидации пароля без цифр")
    void testIsValidWithoutNumbers() {
        String password = "_Gaaaddartt";
        assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.isValid(password),
                "Пароль без цифр должен вызывать исключение");
    }

    @Test
    void testIsValidCorrectPassword() {
        String password = "_Gaaaddartt9";
        assertTrue(
                PasswordValidator.isValid(password),
                "Верный пароль"
        );
    }

    @Test
    void testIsValueNullPassword() {
        String password = "";
        assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.isValid(password),
                "Пустой пароль должен вызвать исключение"
        );
    }
}