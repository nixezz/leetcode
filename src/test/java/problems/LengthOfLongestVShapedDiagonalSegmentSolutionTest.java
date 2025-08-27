package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLongestVShapedDiagonalSegmentSolutionTest {
    LengthOfLongestVShapedDiagonalSegmentSolution solution = new LengthOfLongestVShapedDiagonalSegmentSolution();

    @Test
    public void testLengthOfLongestVShapedDiagonalSegmentSolutionTest_1() {
        int[][] grid = {
                {2, 2, 1, 2, 2},
                {2, 0, 2, 2, 0},
                {2, 0, 1, 1, 0},
                {1, 0, 2, 2, 2},
                {2, 0, 0, 2, 2}
        };
        int expected = 5;
        int result = solution.lenOfVDiagonal(grid);
        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestVShapedDiagonalSegmentSolutionTest_2() {
        int[][] grid = {
                {2, 2, 2, 2, 2},
                {2, 0, 2, 2, 0},
                {2, 0, 1, 1, 0},
                {1, 0, 2, 2, 2},
                {2, 0, 0, 2, 2}
        };
        int expected = 4;
        int result = solution.lenOfVDiagonal(grid);
        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestVShapedDiagonalSegmentSolutionTest_3() {
        int[][] grid = {
                {1, 2, 2, 2, 2},
                {2, 2, 2, 2, 0},
                {2, 0, 0, 0, 0},
                {0, 0, 2, 2, 2},
                {2, 0, 0, 2, 0}
        };
        int expected = 5;
        int result = solution.lenOfVDiagonal(grid);
        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestVShapedDiagonalSegmentSolutionTest_4() {
        int[][] grid = {
                {1}
        };
        int expected = 1;
        int result = solution.lenOfVDiagonal(grid);
        assertEquals(expected, result);
    }
}
