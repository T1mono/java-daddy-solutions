package ru.javadaddy.roadmap.step9_Test.topic1_Junit.task5_PalindromeChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindromeCorrect() {
        String text = "madam";
        assertTrue(PalindromeChecker.isPalindrome(text));
    }

    @Test
    void testPalindromeNull() {
        String text = null;
        assertThrows(IllegalArgumentException.class, () -> PalindromeChecker.isPalindrome(text));
    }

    @Test
    void testPalindromeIsBlank() {
        String text = "";
        assertThrows(IllegalArgumentException.class, () -> PalindromeChecker.isPalindrome(text));
    }

    @Test
    void testPalindromeEqualsIgnoreCase() {
        String text = "MadAM";
        assertTrue(PalindromeChecker.isPalindrome(text));
    }
}