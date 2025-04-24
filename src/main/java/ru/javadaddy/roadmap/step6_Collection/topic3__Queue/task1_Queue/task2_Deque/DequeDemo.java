package ru.javadaddy.roadmap.step6_Collection.topic3__Queue.task1_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(65);
        deque.addFirst(33);

        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addLast(50);

        //Список после добавления элементов
        System.out.println(deque);


        deque.pollFirst();
        deque.pollLast();

        //Список после удаления элементов с начала и конца
        System.out.println(deque);
    }
}
