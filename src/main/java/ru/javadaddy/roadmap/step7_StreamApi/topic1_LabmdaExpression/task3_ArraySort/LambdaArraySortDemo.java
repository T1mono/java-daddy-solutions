package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task3_ArraySort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создайте Java-программу, которая:
 * Инициализирует массив строк, например: {"Java", "Lambda", "Stream", "API"}.
 * Сортирует массив по длине строк с использованием метода Arrays.sort() и лямбда-выражения-компаратора.
 * Выводит отсортированный массив на экран.
 */
public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] s = {"Java", "Lambda", "Stream", "API"};
        System.out.println("До сортировки: " + s);
        Arrays.sort(s, (a, b) -> a.compareTo(b));
        System.out.println("После сортировки: " + s);
    }
}
