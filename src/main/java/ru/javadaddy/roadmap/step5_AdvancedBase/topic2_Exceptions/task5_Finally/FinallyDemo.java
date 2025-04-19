package ru.javadaddy.roadmap.step5_AdvancedBase.topic2_Exceptions.task5_Finally;

/**
 * Напишите Java-программу, которая:
 * Симулирует открытие ресурса (например, через вывод сообщения "Ресурс открыт").
 * Выполняет операцию, которая может выбросить исключение (например, деление на 0).
 * В блоке finally выводит сообщение "Ресурс закрыт" для имитации освобождения ресурса.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Ресурс открыт");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ресурс закрыт");
        }
    }
}
