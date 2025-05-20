package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task9_PersonToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Создайте класс Person с полями:
 * name (тип String)
 * age (тип int)
 * В классе PersonToMapDemo:
 * Инициализируйте список объектов Person.
 * Используйте Stream API и Collectors.toMap() для преобразования списка в Map, где ключ – имя, а значение – возраст.
 * Выведите полученную карту на экран.
 */
public class PersonToMapDemo {
    public static void main(String[] args) {
        Person firstPeron = new Person("Vasya", 23);
        Person secondPerson = new Person("Petya", 29);

        List<Person> personList = new ArrayList<>();
        personList.add(firstPeron);
        personList.add(secondPerson);

        Map<String, Integer> personMap = personList.stream()
                .collect(Collectors.toMap(
                        person -> person.getName(),
                        person -> person.getAge()
                ));
        System.out.println(personMap);
    }
}
