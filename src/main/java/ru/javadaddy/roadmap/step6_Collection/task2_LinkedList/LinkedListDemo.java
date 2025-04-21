package ru.javadaddy.roadmap.step6_Collection.task2_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(34);
        linkedList.add(3452);
        linkedList.add(5444);
        linkedList.add(324);
        linkedList.add(14);

        linkedList.addFirst(500);
        linkedList.addLast(1000);

        //Вывод элементов
        for (Integer number : linkedList) {
            System.out.println(number);
        }

        //Удаление элементов
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("------------------------------------");

        //Проверка удаленных элементов
        for (Integer number : linkedList) {
            System.out.println(number);
        }
    }
}
