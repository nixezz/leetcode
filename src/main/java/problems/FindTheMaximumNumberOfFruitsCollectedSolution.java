package problems;

import java.util.Arrays;
import java.util.function.Supplier;

public class FindTheMaximumNumberOfFruitsCollectedSolution {
    public int maxCollectedFruits(int[][] fruits){
        int n = fruits.length;
        int answer = 0;
        for (int i = 0; i < n; ++i) {
            answer += fruits[i][i];
        }

        Supplier<Integer> dp = () -> {
            int[] previous = new int[n];
            int[] current = new int[n];
            Arrays.fill(previous, Integer.MIN_VALUE);
            Arrays.fill(current, Integer.MIN_VALUE);
            previous[n - 1] = fruits[0][n - 1];
            for (int i = 1; i < n - 1; ++i) {
                for (int j = Math.max(n - 1 - i, i + 1); j < n; ++j) {
                    int best = previous[j];
                    if (j - 1 >= 0){
                        best = Math.max(best, previous[j - 1]);
                    }
                    if (j + 1 < n){
                        best = Math.max(best, previous[j + 1]);
                    }
                    current[j] = best + fruits[i][j];
                }
                int[] temp = previous;
                previous = current;
                current = temp;
            }
            return previous[n - 1];
        };

        answer += dp.get();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = fruits[j][i];
                fruits[j][i] = fruits[i][j];
                fruits[i][j] = temp;
            }
        }

        answer += dp.get();
        return answer;
    }
}
