package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task7_JoinStrings;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите Java-программу, которая:
 * Инициализирует список строк, например: ["red", "green", "blue", "yellow"].
 * Использует Stream API и Collectors.joining(", ") для объединения всех строк в одну строку с разделителем ", ".
 * Выводит полученную строку на экран.
 */
public class JoinStringDemo {
    public static void main(String[] args) {
        List<String> words = List.of("red", "green", "blue", "yellow");

        String joingString = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joingString);
    }
}
