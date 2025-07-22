package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerSolutionTest {
    RomanToIntegerSolution solution = new RomanToIntegerSolution();

    @Test
    public void romanToIntTest_first() {
        String input = "III";
        int expected = 3;
        int result = solution.romanToInt(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed.");
    }

    @Test
    public void romanToIntTest_second() {
        String input = "LVIII";
        int expected = 58;
        int result = solution.romanToInt(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed.");
    }

    @Test
    public void romanToIntTest_third() {
        String input = "MCMXCIV";
        int expected = 1994;
        int result = solution.romanToInt(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed.");
    }
}
