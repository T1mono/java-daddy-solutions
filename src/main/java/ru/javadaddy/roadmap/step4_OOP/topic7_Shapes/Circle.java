package ru.javadaddy.roadmap.step4_OOP.topic7_Shapes;

public class Circle extends Shape {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * 3;
    }
}
