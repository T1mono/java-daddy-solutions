package ru.javadaddy.roadmap.step7_StreamApi.topic2_Streams.task10_PersonSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Создайте класс Person с полями:
 * name (тип String)
 * age (тип int)
 * В классе PersonSortDemo:
 * Инициализируйте список объектов Person.
 * Используйте Stream API и метод sorted() с компаратором, который сначала сравнивает возраст, а при равенстве – имена.
 * Соберите результат в список и выведите его на экран.
 */
public class PersonSortDemo {
    public static void main(String[] args) {
        Person firstPerson = new Person("Vasya", 23);
        Person secondPerson = new Person("Petya", 29);
        Person thirdPerson = new Person("Katya", 19);

        List<Person> personList = new ArrayList<>();
        personList.add(firstPerson);
        personList.add(secondPerson);
        personList.add(thirdPerson);

        List<Person> sortedList = personList.stream()
                .sorted(Comparator.comparingInt((Person person) -> person.getAge())
                        .thenComparing((Person person) -> person.getName())
                )
                .toList();

        System.out.println(sortedList);
    }
}
