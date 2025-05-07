package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task4_Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Определите функциональный интерфейс MyPredicate<T> с методом:
 * boolean test(T t)
 * В классе ArrayFilterDemo:
 * Реализуйте статический метод <T> List<T> filterArray(T[] array, MyPredicate<T> predicate), который перебирает элементы массива и добавляет в результат те, для которых predicate.test возвращает true.
 * В методе main создайте массив чисел (например, {5, 12, 7, 20, 3}) и используйте лямбда-выражение для фильтрации чисел больше 10.
 * Выведите результат.
 */
public class ArrayFilterDemo {
    public static void main(String[] args) {
        Integer[] array = {4, 5, 19, 12, 99, 33, 6, 1, 76};
        List<Integer> result = filterArray(array, value -> value > 10);
        System.out.println(result);
    }

    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            if (predicate.test(t)) {
                list.add(t);
            }
        }
        return list;
    }
}
