package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimePalindromeSolutionTest {
    PrimePalindromeSolution solution = new PrimePalindromeSolution();

    @Test
    public void primePalindromeTest_6() {
        int n = 6;
        int excepted = 7;
        int actual = solution.primePalindrome(n);
        assertEquals(excepted, actual);
    }

    @Test
    public void primePalindromeTest_8() {
        int n = 8;
        int excepted = 11;
        int actual = solution.primePalindrome(n);
        assertEquals(excepted, actual);
    }

    @Test
    public void primePalindromeTest_13() {
        int n = 13;
        int excepted = 101;
        int actual = solution.primePalindrome(n);
        assertEquals(excepted, actual);
    }
}
