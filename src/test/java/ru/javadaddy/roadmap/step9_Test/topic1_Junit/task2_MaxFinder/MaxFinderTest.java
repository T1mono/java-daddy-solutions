package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task2_MaxFinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxFinderTest {

    @Test
    void testFindMaxOneElement() {
        int[] numbers = {23};
        assertEquals(1, numbers.length);
    }

    @Test
    void testFindMaxNegativeNumbers() {
        int[] numbers = {-12, -34, -33};
        assertEquals(-12, MaxFinder.findMax(numbers));
    }

    @Test
    void testFindMaxNullArray() {
        int[] numbers = new int[0];
        assertThrows(IllegalArgumentException.class, ()-> MaxFinder.findMax(numbers));
    }

    @Test
    void testFindMixDuplicateValues() {
        int[] numbers = {2, 2, 2};
        assertEquals(2, MaxFinder.findMax(numbers));
    }
}