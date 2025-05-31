package ru.javadaddy.roadmap.step9_Test.topic1_Junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionCalculatorTest {

    @Test
    void testDivision() {
        assertEquals(5, DivisionCalculator.divide(20, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> DivisionCalculator.divide(2, 0));
    }
}