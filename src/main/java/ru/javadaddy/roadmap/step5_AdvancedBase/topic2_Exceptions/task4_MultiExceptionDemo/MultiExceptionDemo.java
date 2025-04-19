package ru.javadaddy.roadmap.step5_AdvancedBase.topic2_Exceptions.task4_MultiExceptionDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Создаёт массив из нескольких элементов и пытается обратиться к элементу по индексу, выходящему за пределы массива.
 * Пытается вызвать метод у объекта, равного null.
 * Использует конструкцию мульти-catch (catch (Exception1 | Exception2 e)) для перехвата ArrayIndexOutOfBoundsException и NullPointerException.
 * Выводит сообщение об ошибке.
 */
public class MultiExceptionDemo {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, null};

        try {
            System.out.println(array[56]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индекса " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка null " + e.getMessage());
        }
    }
}
