package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalTraverseSolutionTest {
    DiagonalTraverseSolution solution = new DiagonalTraverseSolution();

    @Test
    public void diagonalTraverseTest_1() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        int[] result = solution.findDiagonalOrder(mat);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void diagonalTraverseTest_2() {
        int[][] mat = {
                {1, 2},
                {3, 4},
        };
        int[] expected = {1, 2, 3, 4};
        int[] result = solution.findDiagonalOrder(mat);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
