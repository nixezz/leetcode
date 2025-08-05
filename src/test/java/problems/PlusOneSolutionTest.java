package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneSolutionTest {
    PlusOneSolution solution = new PlusOneSolution();

    @Test
    public void plusOneTest_123() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] result = solution.plusOne(digits);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void plusOneTest_4321() {
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        int[] result = solution.plusOne(digits);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void plusOneTest_9() {
        int[] digits = {9};
        int[] expected = {1, 0};
        int[] result = solution.plusOne(digits);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void plusOneTest_8999() {
        int[] digits = {8, 9, 9, 9};
        int[] expected = {9, 0, 0, 0};
        int[] result = solution.plusOne(digits);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
