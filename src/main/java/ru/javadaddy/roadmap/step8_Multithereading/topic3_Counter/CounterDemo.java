package ru.javadaddy.roadmap.step8_Multithereading.topic3_Counter;

/**
 * Создайте класс Counter с приватным полем count (тип int) и методом increment(), который увеличивает счётчик. Метод должен быть объявлен как synchronized.
 * <p>
 * В классе CounterDemo:
 * <p>
 * Создайте один объект Counter.
 * Создайте несколько потоков, каждый из которых вызывает метод increment() заданное количество раз.
 * Дождитесь завершения всех потоков и выведите итоговое значение счётчика.
 */
public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCounter());
    }
}
