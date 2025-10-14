package problems;

import java.util.List;

public class AdjacentIncreasingSubarraysDetectionISolution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int inc = 1, previousInc = 0, maxLength = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                inc++;
            } else {
                previousInc = inc;
                inc = 1;
            }
            maxLength = Math.max(maxLength, Math.max(inc >> 1, Math.min(previousInc, inc)));
            if (maxLength >= k) {
                return true;
            }
        }
        return false;
    }
}
