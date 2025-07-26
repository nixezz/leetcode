package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerAtoiSolutionTest {
    StringToIntegerAtoiSolution solution = new StringToIntegerAtoiSolution();

    @Test
    public void stringToIntegerTest_42() {
        String input = "42";
        int expected = 42;
        int result = solution.myAtoi(input);
        assertEquals(expected, result, "Test case with input " + input + " and expected " + expected + " failed.");
    }

    @Test
    public void stringToIntegerTest_sssn42() {
        String input = "   -042";
        int expected = -42;
        int result = solution.myAtoi(input);
        assertEquals(expected, result, "Test case with input " + input + " and expected " + expected + " failed.");
    }

    @Test
    public void stringToIntegerTest_1337c0d3() {
        String input = "1337c0d3";
        int expected = 1337;
        int result = solution.myAtoi(input);
        assertEquals(expected, result, "Test case with input " + input + " and expected " + expected + " failed.");
    }

    @Test
    public void stringToIntegerTest_0n1() {
        String input = "0-1";
        int expected = 0;
        int result = solution.myAtoi(input);
        assertEquals(expected, result, "Test case with input " + input + " and expected " + expected + " failed.");
    }

    @Test
    public void stringToIntegerTest_wordsAnd987() {
        String input = "words and 987";
        int expected = 0;
        int result = solution.myAtoi(input);
        assertEquals(expected, result, "Test case with input " + input + " and expected " + expected + " failed.");
    }
}
