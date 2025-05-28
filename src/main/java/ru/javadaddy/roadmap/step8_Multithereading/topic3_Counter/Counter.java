package ru.javadaddy.roadmap.step8_Multithereading.topic3_Counter;

public class Counter implements Runnable {
    private int count;

    public synchronized void increment() {
        count++;
        System.out.println(count);
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
