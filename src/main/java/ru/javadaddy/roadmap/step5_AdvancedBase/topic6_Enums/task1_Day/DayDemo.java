package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task1_Day;

public class DayDemo {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
