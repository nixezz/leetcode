package problems;

import java.util.Arrays;

public class MaximumNumberOfDistinctElementsAfterOperationsSolution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = 0, previous = Integer.MIN_VALUE;

        for (int x : nums){
            int l = Math.max(x - k, previous + 1);
            if (l <= x + k){
                previous = l;
                answer++;
            }
        }

        return answer;
    }
}
