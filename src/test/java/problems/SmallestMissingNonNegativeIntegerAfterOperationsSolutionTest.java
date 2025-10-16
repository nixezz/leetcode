package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestMissingNonNegativeIntegerAfterOperationsSolutionTest {
    SmallestMissingNonNegativeIntegerAfterOperationsSolution solution = new SmallestMissingNonNegativeIntegerAfterOperationsSolution();

    @Test
    public void smallestMissingNonNegativeIntegerAfterOperationsTest_1() {
        int[] nums = {1, -10, 7, 13, 6, 8};
        int value = 5;
        int expected = 4;
        int actual = solution.findSmallestInteger(nums, value);
        assertEquals(expected, actual);
    }

    @Test
    public void smallestMissingNonNegativeIntegerAfterOperationsTest_2() {
        int[] nums = {1, -10, 7, 13, 6, 8};
        int value = 7;
        int expected = 2;
        int actual = solution.findSmallestInteger(nums, value);
        assertEquals(expected, actual);
    }
}
