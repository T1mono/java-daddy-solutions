//package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task1_DivisionCalculator;
//
//import org.junit.jupiter.api.Test;
//import ru.javadaddy.roadmap.step9_Test.topic1_Junit.DivisionCalculator;
//
//import static org.junit.Assert.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class DivisionCalculatorTest {
//
//    @Test
//    void testDivision() {
//        assertEquals(5, DivisionCalculator.divide(20, 4));
//    }
//
//    @Test
//    void testDivisionByZero() {
//        assertThrows(ArithmeticException.class, () -> DivisionCalculator.divide(2, 0));
//    }
//}