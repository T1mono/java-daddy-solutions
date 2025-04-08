package ru.javadaddy.roadmap.step4_OOP.topic2_Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("1", "Gena", 29);
        String studentInfo = student.displayInfo();
        System.out.println(studentInfo);
    }
}
