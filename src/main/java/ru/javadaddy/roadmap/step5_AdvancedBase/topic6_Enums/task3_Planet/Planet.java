package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task3_Planet;

public enum Planet {

    EARTH(5.9722e24, 6.371e6),
    MARS(6.417e23, 3.3895e6),
    JUPITER(1.898e27, 6.9911e7);

    public static final double G = 6.67430e-11;
    private final double mass;

    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double surfaceGravity() {

        return G * mass / (radius * radius);
    }
}
