package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberSolutionTest {
    MissingNumberSolution solution = new MissingNumberSolution();

    @Test
    public void testMissingNumber_1() {
        int[] nums = {3, 0, 1};
        int expected = 2;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber_2() {
        int[] nums = {0, 1};
        int expected = 2;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber_3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }
}
