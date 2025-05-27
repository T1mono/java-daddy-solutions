package ru.javadaddy.roadmap.step8_Multithereading.topic4_ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Создайте класс с общим буфером (например, List), к которому обращаются два типа потоков:
 * Producer: генерирует целые числа и добавляет их в буфер.
 * Consumer: извлекает числа из буфера и выводит их. Используйте методы wait() и notifyAll() для синхронизации доступа к буферу.
 * В классе ProducerConsumerDemo:
 * Запустите один Producer и один Consumer.
 * Ограничьте размер буфера (например, 5 элементов).
 */
public class ProducerConsumerDemo {

    private static final int BUFFER_FIX = 5;
    private static final List<Integer> buffer = new ArrayList<>();

    public static void main(String[] args) {

        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == BUFFER_FIX) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    buffer.add(value);
                    System.out.println("Produced: " + value);
                    value++;
                    buffer.notifyAll();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int val = buffer.remove(0);
                    System.out.println("Consumed: " + val);
                    buffer.notifyAll();
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
