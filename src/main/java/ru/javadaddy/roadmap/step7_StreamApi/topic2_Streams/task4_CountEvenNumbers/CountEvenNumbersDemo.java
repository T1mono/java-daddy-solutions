package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task4_CountEvenNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите Java-программу, которая:
 * Инициализирует список чисел, например: [10, 15, 20, 25, 30, 35].
 * С помощью Stream API фильтрует чётные числа.
 * Подсчитывает количество отфильтрованных чисел.
 * Выводит результат на экран.
 */
public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 15, 20, 25, 30, 35);

        long integerCount = integers.stream()
                .filter(integer -> integer % 2 == 0)
                .count();

        System.out.println(integerCount);
    }
}
