package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfZeroFilledSubarraysSolutionTest {
    NumberOfZeroFilledSubarraysSolution solution = new NumberOfZeroFilledSubarraysSolution();

    @Test
    public void numberOfZeroFilledSubarraysTest_1() {
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        long expected = 6;
        long actual = solution.zeroFilledSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfZeroFilledSubarraysTest_2() {
        int[] nums = {0, 0, 0, 2, 0, 0};
        long expected = 9;
        long actual = solution.zeroFilledSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfZeroFilledSubarraysTest_3() {
        int[] nums = {2, 10, 2019};
        long expected = 0;
        long actual = solution.zeroFilledSubarray(nums);
        assertEquals(expected, actual);
    }
}
