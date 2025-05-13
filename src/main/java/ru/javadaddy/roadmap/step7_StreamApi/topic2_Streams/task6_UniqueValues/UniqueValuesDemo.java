package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task6_UniqueValues;

import java.util.List;

/**
 *Напишите Java-программу, которая:
 * Инициализирует список целых чисел с дубликатами, например: [1, 2, 3, 2, 4, 3, 5, 1].
 * Преобразует список в поток и с помощью метода distinct() оставляет только уникальные значения.
 * Собирает результат в новый список и выводит его на экран.
 */
public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 2, 4, 3, 5, 1);

        List<Integer> distingtsIntegerList = integers.stream().distinct()
                .toList();
        System.out.println(distingtsIntegerList);
    }
}
