package ru.javadaddy.roadmap.step8_Multithereading.topic8_DeadLock;

/**
 * Напишите Java-программу, которая:
 * <p>
 * Создаёт два объекта для синхронизации (например, lock1 и lock2).
 * Запускает два потока:
 * Первый поток синхронизируется сначала по lock1, затем по lock2.
 * Второй поток синхронизируется сначала по lock2, затем по lock1.
 * Продемонстрируйте ситуацию deadlock, где оба потока ждут освобождения замков.
 */
public class DeadLockDemo {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Монитор объекта lock1 захвачен");
                synchronized (lock2) {
                    System.out.println("Монитор объекта lock2 захвачен");

                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Монитор объекта lock2 захвачен");
                synchronized (lock1) {
                    System.out.println("Монитор объекта lock1 захвачен");

                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
