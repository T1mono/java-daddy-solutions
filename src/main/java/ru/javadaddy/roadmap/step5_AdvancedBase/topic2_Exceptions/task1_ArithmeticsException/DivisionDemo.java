package ru.javadaddy.roadmap.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticsException;

/**
 * Напишите Java-программу, которая:
 * Принимает два числа (например, заданы в коде).
 * Пытается выполнить операцию деления первого числа на второе.
 * Использует блок try-catch для обработки исключения ArithmeticException, возникающего при делении на ноль.
 * Выводит сообщение об ошибке, если делитель равен 0, или результат деления в противном случае.
 */
public class DivisionDemo {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 0;

        try {
            int result = firstNumber/secondNumber;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        }
    }
}
