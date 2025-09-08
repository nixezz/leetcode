package problems;

import java.util.Arrays;

public class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int expected_sum = nums.length * (nums.length + 1) / 2;
        int actual_sum = Arrays.stream(Arrays.stream(nums).toArray()).sum();
        return expected_sum - actual_sum;
    }
}
