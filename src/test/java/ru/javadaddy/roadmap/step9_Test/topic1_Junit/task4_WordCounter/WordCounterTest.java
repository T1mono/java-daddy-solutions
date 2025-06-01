package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task4_WordCounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void testCountWordsCorrectText() {
        String text = "Hello world!";
        assertEquals(2, WordCounter.countWords(text));
    }

    @Test
    void testCountWordsNullText() {
        String text = null;
        assertThrows(
                IllegalArgumentException.class,
                () -> WordCounter.countWords(text),
                "Если текст null будет выбрашено исключение"
        );
    }

    @Test
    void testCountWordsWithMultipleSpaces() {
        String text = "Hello  World!";
        assertThrows(IllegalArgumentException.class,
                () -> WordCounter.countWords(text)
        );
    }

    @Test
    void testCountWordsWithTabsAndLineBreaks() {
        String text = "Hello\t World\n!";
        assertThrows(
                IllegalArgumentException.class,
                () -> WordCounter.countWords(text)
        );
    }
}