package ru.javadaddy.roadmap.step6_Collection.task4_ArrayListSort;

import java.util.ArrayList;
import java.util.Collections;

public class SortedListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(42);
        arrayList.add(17);
        arrayList.add(8);
        arrayList.add(99);
        arrayList.add(23);

        Collections.sort(arrayList);

        System.out.println(arrayList);
    }
}
