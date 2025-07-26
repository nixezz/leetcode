package problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumClosestSolutionTest {
    ThreeSumClosestSolution solution = new ThreeSumClosestSolution();

    @Test
    public void threeSumClosest_2() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(expected, result, "Test case with nums " + Arrays.toString(nums) + " and target " + target + " failed.");
    }

    @Test
    public void threeSumClosest_0() {
        int[] nums = new int[]{0, 0, 0};
        int target = 1;
        int expected = 0;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(expected, result, "Test case with nums " + Arrays.toString(nums) + " and target " + target + " failed.");
    }

}
