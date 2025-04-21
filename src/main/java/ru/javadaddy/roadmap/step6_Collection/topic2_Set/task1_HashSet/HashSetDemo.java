package ru.javadaddy.roadmap.step6_Collection.topic2_Set.task1_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> item = new HashSet();
        item.add("Apple");
        item.add("Banana");
        item.add("Orange");
        item.add("Apple");

        for (String s : item) {
            System.out.println(s);
        }
    }
}
