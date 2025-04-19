package ru.javadaddy.roadmap.step5_AdvancedBase.topic2_Exceptions.task2_InvalidAgeException;

/**
 * Напишите Java-программу, которая:
 * Содержит пользовательское исключение InvalidAgeException, наследуемое от Exception.
 * Имеет метод checkAge(int age), который выбрасывает InvalidAgeException, если возраст меньше 0 или больше 150.
 * В методе main вызывайте метод checkAge() и обрабатывайте исключение с помощью try-catch, выводя сообщение об ошибке.
 */
public class AgeCheck {
    public static void main(String[] args) {
        try {
            ageCheck(167);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ageCheck(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным: " + age);
        } else if (age > 150) {
            throw new InvalidAgeException("Возраст не может быть больше 150: " + age);
        }
        System.out.println("Возраст корректный: " + age);
    }
}
