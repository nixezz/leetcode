package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAreaOfLongestDiagonalRectangleSolutionTest {
    MaximumAreaOfLongestDiagonalRectangleSolution solution = new MaximumAreaOfLongestDiagonalRectangleSolution();

    @Test
    public void maximumAreaOfLongestDiagonalRectangleTest_1() {
        int[][] dimensions = {{9, 3}, {8, 6}};
        int expected = 48;
        int result = solution.areaOfMaxDiagonal(dimensions);
        assertEquals(expected, result);
    }

    @Test
    public void maximumAreaOfLongestDiagonalRectangleTest_2() {
        int[][] dimensions = {{3, 4}, {4, 3}};
        int expected = 12;
        int result = solution.areaOfMaxDiagonal(dimensions);
        assertEquals(expected, result);
    }
}
