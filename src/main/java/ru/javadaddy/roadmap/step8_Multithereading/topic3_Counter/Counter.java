package ru.javadaddy.roadmap.step8_Multithereading.topic3_Counter;

public class Counter {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
