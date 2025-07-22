package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersSolutionTest {
    private final LongestSubstringWithoutRepeatingCharactersSolution solution =
            new LongestSubstringWithoutRepeatingCharactersSolution();

    @Test
    public void testLongestSubstring_abc(){
        String s = "abcabcbb";
        int expected = 3;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result,
                "Test case with input " + s + " and expected " + expected + "failed. Result: " + result);
    }

    @Test
    public void testLongestSubstring_bbb(){
        String s = "bbbbb";
        int expected = 1;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result,
                "Test case with input " + s + " and expected " + expected + "failed. Result: " + result);
    }

    @Test
    public void testLongestSubstring_pwke(){
        String s = "pwwkew";
        int expected = 3;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result,
                "Test case with input " + s + " and expected " + expected + "failed. Result: " + result);
    }
}
