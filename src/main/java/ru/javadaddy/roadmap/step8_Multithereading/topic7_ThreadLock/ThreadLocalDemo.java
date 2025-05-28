package ru.javadaddy.roadmap.step8_Multithereading.topic7_ThreadLock;

/**
 * Задача "Использование ThreadLocal переменных"
 * Описание
 * Напишите Java-программу, которая:
 * Создаёт объект ThreadLocal для хранения счетчика, инициализируя его значением 0.
 * Запускает несколько потоков, где каждый поток увеличивает свой счетчик (например, 100 раз).
 * После выполнения каждого потока выводит значение своего счетчика.
 */
public class ThreadLocalDemo {

    static final ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            extracted();
            System.out.println("Thread 1 = " + count.get());
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                int current = count.get();
                count.set(current + 1);
            }
            System.out.println("Thread 2 = " + count.get());
        });

        thread1.start();
        thread2.start();
    }

    private static void extracted() {
        for (int i = 0; i < 100; i++) {
            int current = count.get();
            count.set(current + 1);
        }
    }
}
