package ru.javadaddy.roadmap.step6_Collection.topic1_List.task1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(Integer.valueOf(12));
        list.remove(1);

        for (Integer number : list) {
            System.out.println(list);
        }
    }
}
