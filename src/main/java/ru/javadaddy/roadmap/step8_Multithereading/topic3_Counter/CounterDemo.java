package ru.javadaddy.roadmap.step8_Multithereading.topic3_Counter;

/**
 * Задача "Синхронизация общего счётчика"
 * Описание
 * Создайте класс Counter с приватным полем count (тип int) и методом increment(), который увеличивает счётчик. Метод должен быть объявлен как synchronized.
 *
 * В классе CounterDemo:
 *
 * Создайте один объект Counter.
 * Создайте несколько потоков, каждый из которых вызывает метод increment() заданное количество раз.
 * Дождитесь завершения всех потоков и выведите итоговое значение счётчика.
 */
public class CounterDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Counter());
        Thread thread2 = new Thread(new Counter());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The end");
    }
}
