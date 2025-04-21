package ru.javadaddy.roadmap.step6_Collection.topic2_Set.task2_TreeMap;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> item = new TreeSet<>();
        item.add(50);
        item.add(20);
        item.add(40);
        item.add(10);
        item.add(30);

        for (Integer i : item) {
            System.out.println(i);
        }
    }
}
