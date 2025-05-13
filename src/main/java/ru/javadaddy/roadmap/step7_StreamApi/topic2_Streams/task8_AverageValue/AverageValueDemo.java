package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task8_AverageValue;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Напишите Java-программу, которая:
 * Инициализирует список целых чисел, например: [10, 20, 30, 40, 50].
 * Преобразует список в IntStream с помощью mapToInt().
 * Вычисляет среднее значение с помощью метода average().
 * Выводит среднее значение на экран.
 */
public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);

        OptionalDouble average = list.stream()
                .mapToInt(e -> e.intValue())
                .average();

        System.out.println(average);
    }
}
