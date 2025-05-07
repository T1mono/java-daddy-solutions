package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создайте класс Person с полями:
 * name (тип String)
 * age (тип int)
 * В классе PersonFilterDemo:
 * Инициализируйте список объектов Person.
 * Используйте Stream API для фильтрации: оставьте только тех, чей возраст больше 30.
 * Выведите отфильтрованный список на экран.
 */
public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Petya", 32);
        Person person2 = new Person("Katya", 18);
        Person person3 = new Person("Natasha", 24);
        Person person4 = new Person("Anton", 32);
        Person person5 = new Person("Masha", 43);
        Person person6 = new Person("Alsu", 32);
        Person person7 = new Person("Vasya", 45);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        list.add(person7);

        List<Person> filterList = list.stream().filter(person -> person.getAge() > 30)
                .toList();
        System.out.println(filterList);
    }
}
