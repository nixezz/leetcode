package problems;

import java.util.HashMap;

public class MaximizeTheNumberOfPartitionsAfterOperationsSolution {
    private HashMap<Long, Integer> cache;
    private String s;
    private int k;

    public int maxPartitionsAfterOperations(String s, int k) {
        this.cache = new HashMap<>();
        this.s = s;
        this.k = k;
        return dp(0, 0, true) + 1;
    }

    private int dp(int index, int currentSet, boolean canChange) {
        long key = ((long) index << 27)
                | ((long) currentSet << 1)
                | (canChange ? 1 : 0);

        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        if (index == s.length()) {
            return 0;
        }

        int characterIndex = s.charAt(index) - 'a';
        int currentSetUpdated = currentSet | (1 << characterIndex);
        int distinctCount = Integer.bitCount(currentSetUpdated);

        int result;
        if (distinctCount > k) {
            result = 1 + dp(index + 1, 1 << characterIndex, canChange);
        } else {
            result = dp(index + 1, currentSetUpdated, canChange);
        }

        if (canChange) {
            for (int newCharIndex = 0; newCharIndex < 26; newCharIndex++) {
                int newSet = currentSet | (1 << newCharIndex);
                int newDistinctCount = Integer.bitCount(newSet);

                if (newDistinctCount > k) {
                    result = Math.max(result, 1 + dp(index + 1, 1 << newCharIndex, false));
                } else {
                    result = Math.max(result, dp(index + 1, newSet, false));
                }
            }
        }

        cache.put(key, result);
        return result;
    }
}
