package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortMatrixByDiagonalsSolutionTest {
    SortMatrixByDiagonalsSolution solution = new SortMatrixByDiagonalsSolution();

    @Test
    public void sortMatrixTest_1(){
        int[][] matrix = {
                {1, 7, 3},
                {9, 8, 2},
                {4, 5, 6}
        };
        int[][] expected = {
                {8, 2, 3},
                {9, 6, 7},
                {4, 5, 1}
        };
        int[][] result = solution.sortMatrix(matrix);
        assertEquals(expected.length, result.length);
        assertEquals(expected[0].length, result[0].length);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

    @Test
    public void sortMatrixTest_2(){
        int[][] matrix = {
                {0, 1},
                {1, 2}
        };
        int[][] expected = {
                {2, 1},
                {1, 0}
        };
        int[][] result = solution.sortMatrix(matrix);
        assertEquals(expected.length, result.length);
        assertEquals(expected[0].length, result[0].length);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

    @Test
    public void sortMatrixTest_3(){
        int[][] matrix = {
                {1}
        };
        int[][] expected = {
                {1}
        };
        int[][] result = solution.sortMatrix(matrix);
        assertEquals(expected.length, result.length);
        assertEquals(expected[0].length, result[0].length);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }
}
