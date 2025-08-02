package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class RearrangingFruitsSolution {
    public long minCost(int[] basket1, int[] basket2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int min = Integer.MAX_VALUE;
        for (int b1 : basket1){
            map.put(b1, map.getOrDefault(b1, 0) + 1);
            min = Math.min(min, b1);
        }
        for (int b2 : basket2){
            map.put(b2, map.getOrDefault(b2, 0) - 1);
            min = Math.min(min, b2);
        }

        List<Integer> merge = new ArrayList<>();
        for (var entry : map.entrySet()){
            int count = entry.getValue();
            if (count % 2 != 0) return -1;
            for (int i = 0; i < Math.abs(count) / 2; i++) {
                merge.add(entry.getKey());
            }
        }

        Collections.sort(merge);
        long result = 0;
        for (int i = 0; i < merge.size() / 2; i++) {
            result += Math.min(2 * min, merge.get(i));
        }
        return result;
    }
}
