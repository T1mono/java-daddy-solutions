package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task2_MapToSquare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите Java-программу, которая:
 * Инициализирует список чисел, например: [1, 2, 3, 4, 5].
 * Применяет метод map() для возведения каждого числа в квадрат.
 * Собирает результат в новый список и выводит его на экран.
 */
public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(8);

        List<Integer> result = list.stream().map(value -> value * value)
                .toList();
        System.out.println(result);
    }
}
