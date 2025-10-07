package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFloodInTheCitySolution {
    public int[] avoidFlood(int[] rains) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        int[] result = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                treeSet.add(i);
            } else {
                if (map.containsKey(rains[i])) {
                    Integer next = treeSet.ceiling(map.get(rains[i]));
                    if (next == null) return new int[0];
                    result[next] = rains[i];
                    treeSet.remove(next);
                }
                result[i] = -1;
                map.put(rains[i], i);
            }
        }
        for(int i : treeSet) result[i] = 1;
        return result;
    }
}
