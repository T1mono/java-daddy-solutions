package ru.javadaddy.roadmap.step8_Multithereading.topic2_Runnable;

/**
 * Напишите Java-программу, в которой:
 * <p>
 * В методе main создайте несколько Runnable с помощью лямбда-выражения, которые выводят, например, "Task X is running" ( где X – номер задачи).
 * Создайте для каждого объекта новый поток и запустите его.
 * Дождитесь завершения потоков с помощью join().
 */
public class RunnableLambdaDemo {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Task1 is running");
        Runnable task2 = () -> System.out.println("Task2 is running");

        Thread thread1 = new Thread(task1, "Task1");
        Thread thread2 = new Thread(task2, "Task2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End");
    }
}
