package ru.javadaddy.roadmap.step4_OOP.topic1_Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Gena", 29);
        String personInfo = person.displayInfo();
        System.out.println(personInfo);
    }
}
