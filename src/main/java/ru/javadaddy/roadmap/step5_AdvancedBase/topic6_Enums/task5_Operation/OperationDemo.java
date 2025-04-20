package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task5_Operation;

public class OperationDemo {
    public static void main(String[] args) {
        for (Operation value : Operation.values()) {
            System.out.println(value.name() + " " + value.apply(24, 2));
        }
    }
}
