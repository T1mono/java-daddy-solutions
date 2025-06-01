package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task4_WordCounter;

/**
 * Метод countWords(String text) принимает строку и возвращает количество слов в ней (разделенных пробелами
 * <p>
 * Напишите тесты для следующих случаев:
 * Обычный текст
 * Пустая строка
 * Строка с несколькими пробелами подряд
 * Строка с табуляцией и переносами строк
 * Найдите ошибки и предложите исправления.
 */
public class WordCounter {
    public static int countWords(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Текст не можеть быть пустым");
        }

        if (text.isBlank()) {
            throw new IllegalArgumentException("Текст не может быть пустым или содержать только пробелы");
        }

        if (text.matches(".*\\s{2,}.*")) {
            throw new IllegalArgumentException("В тексте 2 пробела подряд");
        }

        if (text.matches(".*[\\t\\n\\r].*")) {
            throw new IllegalArgumentException("Текст не должен содержать табуляцию или переносы строк");
        }
        return text.split(" ").length;
    }
}
