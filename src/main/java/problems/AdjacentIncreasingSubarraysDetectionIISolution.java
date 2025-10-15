package problems;

import java.util.List;

public class AdjacentIncreasingSubarraysDetectionIISolution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int count = 1, previousCount = 0, answer = 0;

        for (int i = 1; i < n; ++i) {
            if (nums.get(i) > nums.get(i - 1)) {
                ++count;
            } else {
                previousCount = count;
                count = 1;
            }
            answer = Math.max(answer, Math.min(previousCount, count));
            answer = Math.max(answer, count / 2);
        }

        return answer;
    }
}
