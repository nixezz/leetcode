package problems;

import java.util.Arrays;

public class FindTheNumberOfWaysToPlacePeopleISolution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;

        Arrays.sort(points, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(b[0], a[0]);
        });

        int counter = 0;

        for (int i = 0; i < n - 1; i++) {
            int minY = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                if(points[j][1] >= points[i][1] && points[j][1] < minY) {
                    counter++;
                    minY = points[j][1];
                }
            }
        }

        return counter;
    }
}
