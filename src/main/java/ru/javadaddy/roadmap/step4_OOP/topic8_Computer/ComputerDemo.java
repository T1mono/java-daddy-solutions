package ru.javadaddy.roadmap.step4_OOP.topic8_Computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(
          "ASUS",
          "Gaming 500",
          "256"
        );

        System.out.println(computer.displaySpecs());
    }
}
