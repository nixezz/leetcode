package problems;

import java.util.HashMap;
import java.util.Map;

public class SoupServingsSolution {
    private double calcDP(int a, int b, Map<Integer, Map<Integer, Double>> dp){
        return (
                dp.get(Math.max(0, a - 4)).get(b)
                + dp.get(Math.max(0, a - 3)).get(b - 1)
                + dp.get(Math.max(0, a - 2)).get(Math.max(0, b - 2))
                + dp.get(a - 1).get(Math.max(0, b - 3))
        ) / 4;
    }

    public double soupServings(int n) {
        if(n > 5000){
            return 1.0;
        }

        int m = (int) Math.ceil(n / 25.0);
        Map<Integer, Map<Integer, Double>> dp = new HashMap<>();
        dp.put(0, new HashMap<>());
        dp.get(0).put(0, 0.5);

        for (int i = 1; i <= m; i++) {
            dp.put(i, new HashMap<>());
            dp.get(0).put(i, 1.0);
            dp.get(i).put(0, 0.0);
            for (int j = 1; j <= i; j++) {
                dp.get(j).put(i, calcDP(j, i, dp));
                dp.get(i).put(j, calcDP(i, j, dp));
            }
            if(dp.get(i).get(i) > 1 - 1e-5){
                return 1;
            }
        }

        return dp.get(m).get(m);
    }
}
