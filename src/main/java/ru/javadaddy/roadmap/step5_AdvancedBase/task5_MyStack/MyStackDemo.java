package ru.javadaddy.roadmap.step5_AdvancedBase.task5_MyStack;

import java.util.Stack;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> newStack =new MyStack<>();
        newStack.push(1);
        newStack.push(2);
        newStack.push(23);

        System.out.println(newStack.peek());
        System.out.println(newStack.pop());
        System.out.println(newStack.peek());
    }
}
