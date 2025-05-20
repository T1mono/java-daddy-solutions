package ru.javadaddy.roadmap.step8_Multithereading.topic1_MyThread;

public class ThreadExtendDemo {
    public static void main(String[] args) {
        MyThread firstMyThread = new MyThread("Первый поток");
        MyThread secondMyThread = new MyThread("Второй поток");
        firstMyThread.start();
        secondMyThread.start();

        try {
            firstMyThread.join();
            secondMyThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Конец");
    }
}
