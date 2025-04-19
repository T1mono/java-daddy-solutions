package ru.javadaddy.roadmap.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

public class ArrayUtils {

    public static <T> void swap(T[] array, int i, int j) {
        if (array == null) {
            throw new NullPointerException("Массив не может быть пустым");
        }

        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вышел за пределы массива");
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}