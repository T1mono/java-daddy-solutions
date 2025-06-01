package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task2_MaxFinder;


/**
 * Напишите тесты на граничные случаи:
 * массив с одним элементом
 * массив из отрицательных чисел
 * массив с повторяющимися значениями
 * пустой массив
 * Найдите возможные ошибки и предложите исправление.
 */
public class MaxFinder {
    public static int findMax(int[] numbers) { //На вход приходит массив int-ов,
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int max = numbers[0]; //Берем и назначем число под индексом 0 и предполагаем, что оно максимальное число

        for (int num : numbers) { //Проходим по массиву по каждому элементу массива и если следующий элемент больше max, то max == num
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
