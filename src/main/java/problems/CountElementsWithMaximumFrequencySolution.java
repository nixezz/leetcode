package problems;

import java.util.HashMap;

public class CountElementsWithMaximumFrequencySolution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        int sumMax = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == max) {
                sumMax += map.get(num);
            }
        }
        return sumMax;
    }
}
