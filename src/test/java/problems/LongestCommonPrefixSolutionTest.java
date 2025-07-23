package problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixSolutionTest {
    LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();

    @Test
    public void longestCommonPrefixTest_first() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual,
                "Test case with input " + Arrays.toString(strs) + " and expected " + expected + " failed.");
    }

    @Test
    public void longestCommonPrefixTest_second() {
        String[] strs = {"dog", "racecar", "car"};
        String expected = "";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual,
                "Test case with input " + Arrays.toString(strs) + " and expected " + expected + " failed.");
    }
}
