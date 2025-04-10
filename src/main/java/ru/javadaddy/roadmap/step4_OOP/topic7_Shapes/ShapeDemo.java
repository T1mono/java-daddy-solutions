package ru.javadaddy.roadmap.step4_OOP.topic7_Shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.3);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());
    }
}
