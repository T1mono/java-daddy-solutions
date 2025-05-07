package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task5_Converter;

import java.util.Arrays;

/**
 * Определите функциональный интерфейс Converter с методом:
 * int convert(int x)
 * В классе ConverterDemo:
 * Реализуйте статический метод int[] convertArray(int[] array, Converter converter), который перебирает элементы массива, преобразует их с помощью converter.convert
 * и сохраняет в новый массив.
 * В методе main создайте массив чисел (например, {1, 2, 3, 4, 5}) и используйте лямбда-выражение для вычисления квадратов чисел.
 * Выведите преобразованный массив.
 * Требования
 */
public class ConverterDemo {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 5};
        int[] result = convertArray(array, value -> value * value);
        System.out.println(Arrays.toString(result));
    }

    static int[] convertArray(int[] array, Converter converter) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = converter.convert(array[i]);
        }
        return result;
    }
}
