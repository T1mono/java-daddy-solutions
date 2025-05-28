package ru.javadaddy.roadmap.step8_Multithereading.topic9_RaceCondition;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Напишите Java-программу, которая:
 * <p>
 * Создаёт общий счётчик (например, int count = 0).
 * Запускает несколько потоков, которые в цикле (например, 1000 раз) увеличивают этот счётчик без синхронизации.
 * После завершения всех потоков выводит итоговое значение счётчика.
 * (Опционально: реализуйте версию с синхронизацией для сравнения результатов.)
 */
public class RaceConditionDemo {
    public static int count = 0;

    public static AtomicInteger count1 = new AtomicInteger(0);

    public static void main(String[] args) {
        // Без синхронизации
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count++;
                System.out.println("Cчётчик потока 1 = " + count);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count++;
                System.out.println("Cчётчик потока 2 = " + count);
            }
        });

        thread1.start();
        thread2.start();

        // С синхронизацией
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count1.getAndIncrement();
                System.out.println(Thread.currentThread().getName() + " " + count1);
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count1.getAndIncrement();
                System.out.println(Thread.currentThread().getName() + " " + count1);
            }
        });

        thread3.start();
        thread4.start();
    }
}
