package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task3_GroupWords;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Напишите Java-программу, которая:
 * Имеет список строк, например: ["apple", "ant", "banana", "berry", "cherry", "carrot"].
 * Использует Stream API и Collectors.groupingBy для группировки строк по первой букве.
 * Выводит полученную карту, где ключ – первая буква, а значение – список строк.
 */
public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry");

        Map<Character, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(result);
    }
}
