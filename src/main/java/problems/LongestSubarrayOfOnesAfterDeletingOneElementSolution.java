package problems;

public class LongestSubarrayOfOnesAfterDeletingOneElementSolution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestSubarray = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            zeroCount += (nums[i] == 0 ? 1 : 0);

            while(zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }

            longestSubarray = Math.max(longestSubarray, i - start);
        }

        return longestSubarray;
    }
}

