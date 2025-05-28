package ru.javadaddy.roadmap.step8_Multithereading.topic6_Interrupt;

/**
 * Напишите Java-программу, которая:
 * <p>
 * Создаёт поток, выполняющий бесконечный цикл с выводом сообщения (например, "Работаю...") каждые 500 мс.
 * Основной поток ждёт 3 секунды, затем вызывает interrupt() для рабочего потока.
 * В рабочем потоке регулярно проверяется флаг прерывания (через isInterrupted()) и при обнаружении прерывания – завершается.
 */
public class InterruptDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Работа....");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
