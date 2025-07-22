package problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
    private static final Map<String, Integer> romanToIntegerMap = new HashMap<>(Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    ));

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanToIntegerMap.get(String.valueOf(s.charAt(i)));
            if(i+1 < s.length()) {
                int next = romanToIntegerMap.get(String.valueOf(s.charAt(i+1)));
                if(current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }
}
