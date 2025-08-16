package problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementSolutionTest {
    RemoveElementSolution solution = new RemoveElementSolution();

    @Test
    public void removeElementTest_1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2}; // K = 2
        int K = solution.removeElement(nums, val);
        assertEquals(expectedNums.length, K, "Array length error");
        Arrays.sort(nums, 0, K);
        Arrays.sort(expectedNums, 0, K);
        for (int i = 0; i < expectedNums.length; i++) {
            assertEquals(expectedNums[i], nums[i], "Element error");
        }
    }

    @Test
    public void removeElementTest_2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 1, 4, 0, 3}; // K = 5
        int K = solution.removeElement(nums, val);
        assertEquals(expectedNums.length, K, "Array length error");
        Arrays.sort(nums, 0, K);
        Arrays.sort(expectedNums, 0, K);
        for (int i = 0; i < expectedNums.length; i++) {
            assertEquals(expectedNums[i], nums[i], "Element error");
        }
    }
}
