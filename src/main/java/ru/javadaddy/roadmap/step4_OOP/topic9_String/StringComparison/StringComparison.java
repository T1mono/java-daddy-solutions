package ru.javadaddy.roadmap.step4_OOP.topic9_String.StringComparison;

public class StringComparison {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = new String("Hello");

        System.out.println(firstString==secondString);
        System.out.println(firstString.equals(secondString));
    }
}
