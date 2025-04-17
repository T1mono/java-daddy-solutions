package ru.javadaddy.roadmap.step5_AdvancedBase.task3_Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(1);
        box.setValue(2);
        System.out.println(box);
    }
}
