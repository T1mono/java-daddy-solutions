package ru.javadaddy.roadmap.step6_Collection.topic1_List.task3_Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push(("Second"));
        stack.push("Third");

        //Просмотр верхнего элемента
        System.out.println(stack.peek());

        //Опустошение стека
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
