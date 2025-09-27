package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestTriangleArenaSolutionTest {
    LargestTriangleArenaSolution solution = new LargestTriangleArenaSolution();

    @Test
    public void largestTriangleTest_1() {
        int[][] points = {
                {0, 0},
                {0, 1},
                {1, 0},
                {0, 2},
                {2, 0}
        };
        double expected = 2.0;
        double actual = solution.largestTriangleArea(points);
        assertEquals(expected, actual);
    }

    @Test
    public void largestTriangleTest_2() {
        int[][] points = {
                {0, 0},
                {0, 1},
                {1, 0}
        };
        double expected = 0.5;
        double actual = solution.largestTriangleArea(points);
        assertEquals(expected, actual);
    }
}
