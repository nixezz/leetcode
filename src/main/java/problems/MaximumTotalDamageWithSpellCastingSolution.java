package problems;

import java.util.*;

public class MaximumTotalDamageWithSpellCastingSolution {
    private int binarySearch(List<Integer> keys, int end, int value){
        int left = 0, right = end, answer = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(keys.get(mid) <= value){
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> map = new HashMap<>();
        for(int p : power){
            map.put(p, map.getOrDefault(p, 0L) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int n = keys.size();
        long[] dp = new long[n];
        dp[0] = map.get(keys.get(0)) * keys.get(0);

        for(int i = 1; i < n; i++){
            long take = map.get(keys.get(i)) * keys.get(i);
            int previous = binarySearch(keys, i - 1, keys.get(i) - 3);
            if (previous >= 0){
                take += dp[previous];
            }
            dp[i] = Math.max(dp[i - 1], take);
        }

        return dp[n - 1];
    }
}
