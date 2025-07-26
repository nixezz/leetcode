package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerSolutionTest {
    ReverseIntegerSolution solution = new ReverseIntegerSolution();

    @Test
    public void reverseIntegerTest_123() {
        int input = 123;
        int expected = 321;
        int result = solution.reverse(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed."
        );
    }

    @Test
    public void reverseIntegerTest_n123() {
        int input = -123;
        int expected = -321;
        int result = solution.reverse(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed."
        );
    }

    @Test
    public void reverseIntegerTest_n1234() {
        int input = -1234;
        int expected = -4321;
        int result = solution.reverse(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed."
        );
    }

    @Test
    public void reverseIntegerTest_120() {
        int input = 120;
        int expected = 21;
        int result = solution.reverse(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed."
        );
    }
    @Test
    public void reverseIntegerTest_1534236469() {
        int input = 1_534_236_469;
        int expected = 0;
        int result = solution.reverse(input);
        assertEquals(expected, result,
                "Test case with input " + input + " and expected " + expected + " failed."
        );
    }
}
