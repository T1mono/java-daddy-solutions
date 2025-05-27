package ru.javadaddy.roadmap.step8_Multithereading.topic5_ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Напишите Java-программу, которая:
 * <p>
 * Создаёт пул потоков с использованием Executors.newFixedThreadPool() (например, 3 потока).
 * Отправляет в пул несколько задач (например, 5 задач), каждая из которых выводит сообщение с номером задачи и именем текущего потока.
 * После отправки задач корректно завершает работу пула с помощью shutdown() и awaitTermination().
 */
public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;

            executorService.execute(() -> {
                System.out.println(taskNumber + " " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
