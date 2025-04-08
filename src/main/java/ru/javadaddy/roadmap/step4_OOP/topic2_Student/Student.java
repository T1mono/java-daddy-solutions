package ru.javadaddy.roadmap.step4_OOP.topic2_Student;

public class Student extends Person {
    private String id;


    public Student(String id, String name, int age) {
        super(name, age);
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String displayInfo() {
        return "Student ID:" + "[" + id + "], " + super.displayInfo();
    }
}
