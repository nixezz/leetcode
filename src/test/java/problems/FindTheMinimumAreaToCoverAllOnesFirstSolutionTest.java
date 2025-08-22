package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMinimumAreaToCoverAllOnesFirstSolutionTest {
    FindTheMinimumAreaToCoverAllOnesFirstSolution solution = new FindTheMinimumAreaToCoverAllOnesFirstSolution();

    @Test
    public void findTheMinimumAreaTest_1() {
        int[][] grid = {
                {0, 1, 0},
                {1, 0, 1}
        };
        int expected = 6;
        int result = solution.minimumArea(grid);
        assertEquals(expected, result);
    }

    @Test
    public void findTheMinimumAreaTest_2() {
        int[][] grid = {
                {1, 0},
                {0, 0}
        };
        int expected = 1;
        int result = solution.minimumArea(grid);
        assertEquals(expected, result);
    }
}
