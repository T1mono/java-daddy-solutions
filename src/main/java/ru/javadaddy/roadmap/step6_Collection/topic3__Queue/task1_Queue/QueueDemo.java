package ru.javadaddy.roadmap.step6_Collection.topic3__Queue.task1_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        //Первый элемент без удаления
        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}


