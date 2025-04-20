package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task2_Color;

public class ColorDemo {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color.name() + " - " + color.getHexCode());
        }
    }
}
