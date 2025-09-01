package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAveragePassRatioSolutionTest {
    MaximumAveragePassRatioSolution solution = new MaximumAveragePassRatioSolution();

    @Test
    public void testMaximumAveragePassRatioTest_1() {
        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        double expected = 0.78333;
        double result = solution.maxAverageRatio(classes, extraStudents);
        assertEquals(result, expected, 0.15);
    }

    @Test
    public void testMaximumAveragePassRatioTest_2() {
        int[][] classes = {{2, 4}, {3, 9}, {4, 5}, {2, 10}};
        int extraStudents = 4;
        double expected = 0.53485;
        double result = solution.maxAverageRatio(classes, extraStudents);
        assertEquals(result, expected, 0.15);
    }
}
