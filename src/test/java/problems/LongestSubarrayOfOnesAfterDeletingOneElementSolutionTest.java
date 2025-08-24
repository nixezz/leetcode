package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayOfOnesAfterDeletingOneElementSolutionTest {
    LongestSubarrayOfOnesAfterDeletingOneElementSolution solution = new LongestSubarrayOfOnesAfterDeletingOneElementSolution();

    @Test
    public void longestSubarrayTest_1() {
        int[] nums = {1, 1, 0, 1};
        int expected = 3;
        int result = solution.longestSubarray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void longestSubarrayTest_2() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int expected = 5;
        int result = solution.longestSubarray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void longestSubarrayTest_3() {
        int[] nums = {1, 1, 1};
        int expected = 2;
        int result = solution.longestSubarray(nums);
        assertEquals(expected, result);
    }

    @Test
    public void longestSubarrayTest_4() {
        int[] nums = {0, 0, 0};
        int expected = 0;
        int result = solution.longestSubarray(nums);
        assertEquals(expected, result);
    }
}
