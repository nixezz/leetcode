package problems;

import java.util.Arrays;

public class FindTheNumberOfWaysToPlacePeopleIISolution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });

        int counter = 0;
        final int n = points.length;

        for (int i = 0; i < n; i++) {
            int upperY = points[i][1];
            int lowerY = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                if(points[j][1] <= upperY && points[j][1] > lowerY){
                    counter++;
                    lowerY = points[j][1];
                    if (points[j][1] == upperY) break;
                }
            }
        }

        return counter;
    }
}
