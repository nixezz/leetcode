package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumberSolutionTest {
    PalindromeNumberSolution solution = new PalindromeNumberSolution();

    @Test
    public void isPalindromeTest_first() {
        int x = 121;
        boolean expected = true;
        boolean result = solution.isPalindrome(x);
        assertEquals(expected, result,
                "Test case with input " + x + " and expected " + expected + " failed.");
    }

    @Test
    public void isPalindromeTest_second() {
        int x = -121;
        boolean expected = false;
        boolean result = solution.isPalindrome(x);
        assertEquals(expected, result,
                "Test case with input " + x + " and expected " + expected + " failed.");
    }

    @Test
    public void isPalindromeTest_third() {
        int x = 10;
        boolean expected = false;
        boolean result = solution.isPalindrome(x);
        assertEquals(expected, result,
                "Test case with input " + x + " and expected " + expected + " failed.");
    }
}
