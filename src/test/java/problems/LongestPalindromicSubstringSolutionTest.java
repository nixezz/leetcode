package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringSolutionTest {
    private final LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();

    @Test
    public void longestPalindromeTest_first() {
        String s = "babad";
        String expected = "bab";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result,
                "Test case with input " + s + " and expected " + expected + "failed.");
    }

    @Test
    public void longestPalindromeTest_second() {
        String s = "cbbd";
        String expected = "bb";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result,
                "Test case with input " + s + " and expected " + expected + "failed.");
    }
}
