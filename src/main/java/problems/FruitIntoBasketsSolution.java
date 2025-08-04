package problems;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasketsSolution {
    public int totalFruit(int[] fruits) {
        int start = 0, end = 0, n = fruits.length, maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (end < n){
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            while (map.size() >= 3){
                map.put(fruits[start], map.getOrDefault(fruits[start], 0) - 1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            int currentLength = end - start + 1;
            maxLength = Math.max(maxLength, currentLength);
            end++;
        }
        return maxLength;
    }
}
