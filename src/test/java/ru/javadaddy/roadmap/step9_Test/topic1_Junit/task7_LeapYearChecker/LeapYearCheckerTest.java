package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task7_LeapYearChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCheckerTest {

    @Test
    void isLeapYearMultiplieOfFour() {
        assertTrue(LeapYearChecker.isLeapYear(2000));
    }
    @Test
    void isLeapYearMultiplieOfHundredNotFourHundred() {
        assertFalse(LeapYearChecker.isLeapYear(2500));
    }

    @Test
    void isLeapYearMultiplieOfFourHundred() {
        int year = 1600;
        assertTrue(LeapYearChecker.isLeapYear(1600));
    }

    @Test
    void notLeapYearWhenNotDivisibleByFour() {
        assertFalse(LeapYearChecker.isLeapYear(2023));
    }


}