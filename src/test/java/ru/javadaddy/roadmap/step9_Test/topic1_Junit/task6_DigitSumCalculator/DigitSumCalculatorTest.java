package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task6_DigitSumCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumCalculatorTest {

    @Test
    void sumDigitsSingle() {
        int number = 3;
        assertEquals(3, DigitSumCalculator.sumDigits(number));
    }

    @Test
    void sumDigitsMulti() {
        int number = 333;
        assertEquals(9, DigitSumCalculator.sumDigits(number));
    }

    @Test
    void sumDigitsNegative() {
        int number = -333;
        assertThrows(IllegalArgumentException.class, ()-> DigitSumCalculator.sumDigits(number));
    }

    @Test
    void sumDigitsByZero() {
        int number = 0;
        assertEquals(0, DigitSumCalculator.sumDigits(number));
    }
}