package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanSolutionTest {
    IntegerToRomanSolution solution = new IntegerToRomanSolution();

    @Test
    public void intToRomanTest_first() {
        int num = 3749;
        String expected = "MMMDCCXLIX";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual,
                "Test case with input " + num + " and expected " + expected + " failed.");
    }

    @Test
    public void intToRomanTest_second() {
        int num = 58;
        String expected = "LVIII";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual,
                "Test case with input " + num + " and expected " + expected + " failed.");
    }

    @Test
    public void intToRomanTest_third() {
        int num = 1994;
        String expected = "MCMXCIV";
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual,
                "Test case with input " + num + " and expected " + expected + " failed.");
    }
}
