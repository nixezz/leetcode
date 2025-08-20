package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSquareSubmatricesWithAllOnesSolutionTest {
    CountSquareSubmatricesWithAllOnesSolution solution = new CountSquareSubmatricesWithAllOnesSolution();

    @Test
    public void countSquareSubmatricesTest_1() {
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        int expected = 15;
        int actual = solution.countSquares(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void countSquareSubmatricesTest_2() {
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        };
        int expected = 7;
        int actual = solution.countSquares(matrix);
        assertEquals(expected, actual);
    }
}
