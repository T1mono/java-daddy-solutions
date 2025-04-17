package ru.javadaddy.roadmap.step5_AdvancedBase.task5_MyStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте класс MyStack<T> с приватным полем для хранения элементов (например, ArrayList). Класс должен содержать методы:
 * push(T element) для добавления элемента.
 * pop() для удаления и возврата верхнего элемента.
 * peek() для возврата верхнего элемента без удаления.
 * isEmpty() для проверки, пуст ли стек.
 * В классе MyStackDemo продемонстрируйте работу стека, добавив несколько элементов, затем извлекая их.
 *
 * @param <T>
 */
public class MyStack<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    public void push(T item) {
        arrayList.add(item);
    }

    public T pop() {
        if (arrayList.isEmpty()) {
            return null;
        }

        T lastElement = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return lastElement;
    }

    public T peek() {
        if (arrayList.isEmpty()) {
            return null;
        }

        return arrayList.get(0);
    }
}
