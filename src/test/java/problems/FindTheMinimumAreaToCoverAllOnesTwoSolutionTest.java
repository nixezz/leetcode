package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMinimumAreaToCoverAllOnesTwoSolutionTest {
    FindTheMinimumAreaToCoverAllOnesTwoSolution solution = new FindTheMinimumAreaToCoverAllOnesTwoSolution();

    @Test
    public void minimumSumTest_1() {
        int[][] grid = {
                {1, 0, 1},
                {1, 1, 1}
        };
        int expected = 5;
        int actual = solution.minimumSum(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void minimumSumTest_2() {
        int[][] grid = {
                {1, 0, 1, 0},
                {0, 1, 0, 1}
        };
        int expected = 5;
        int actual = solution.minimumSum(grid);
        assertEquals(expected, actual);
    }
}
