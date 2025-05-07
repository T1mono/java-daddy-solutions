package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task2_StringModifier;

/**
 * Определите функциональный интерфейс StringModifier с методом:
 * String modify(String s)
 * В классе StringModifierDemo:
 * Реализуйте интерфейс через лямбда-выражение, которое преобразует строку в верхний регистр и добавляет "!".
 * Выведите результат работы метода modify().
 */
public class StringModifierDemo {
    public static void main(String[] args) {
        StringMidifier stringModifier = e -> e.toUpperCase() + "!";
        String s = stringModifier.modify("Privet");
        System.out.println(s);
    }
}
