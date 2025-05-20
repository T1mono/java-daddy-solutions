package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task5_MinString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Напишите Java-программу, которая:
 * Имеет список строк, например: ["elephant", "cat", "hippopotamus", "dog", "lion"].
 * Использует Stream API для поиска строки с минимальной длиной с помощью метода min() и компаратора.
 * Выводит найденную строку на экран (если такая существует).
 */
public class MinStringDemo {
    public static void main(String[] args) {
        List<String> words = List.of("elephant", "cat", "hippopotamus", "dog", "lion");

        Optional<String> min = words.stream()
                .min((s1, s2) -> s1.compareTo(s2));
        System.out.println(min);
    }
}
