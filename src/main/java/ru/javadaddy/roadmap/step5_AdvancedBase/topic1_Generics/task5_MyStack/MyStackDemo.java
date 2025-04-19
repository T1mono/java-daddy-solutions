package ru.javadaddy.roadmap.step5_AdvancedBase.topic1_Generics.task5_MyStack;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> newStack = new MyStack<>();
        newStack.push("Первый");
        newStack.push("Второй");
        newStack.push("Третий");

        System.out.println("Достали элемент: " + newStack.peek());

        while (!newStack.isEmpty()) {
            System.out.println("Достали элемент: " + newStack.pop());
        }
    }
}
