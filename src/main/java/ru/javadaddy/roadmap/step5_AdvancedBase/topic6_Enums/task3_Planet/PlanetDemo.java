package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task3_Planet;

public class PlanetDemo {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Гравитация " + planet.name() + " - " + planet.surfaceGravity());
        }
    }
}
