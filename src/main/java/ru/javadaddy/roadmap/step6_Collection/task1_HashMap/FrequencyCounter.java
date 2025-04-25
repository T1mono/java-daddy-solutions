package ru.javadaddy.roadmap.step6_Collection.task1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};

        Map<String, Integer> map = new HashMap<>();

        for (String fruit : fruits) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }

        for (Map.Entry<String ,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }
    }
}
