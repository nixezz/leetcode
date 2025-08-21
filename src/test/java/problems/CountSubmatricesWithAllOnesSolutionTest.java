package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubmatricesWithAllOnesSolutionTest {
    CountSubmatricesWithAllOnesSolution solution = new CountSubmatricesWithAllOnesSolution();

    @Test
    public void countSubmatricesWithAllOnesSolutionTest_1() {
        int[][] mat = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        };
        int expected = 13;
        int actual = solution.numSubmat(mat);
        assertEquals(expected, actual);
    }

    @Test
    public void countSubmatricesWithAllOnesSolutionTest_2() {
        int[][] mat = {
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 1, 1, 0}
        };
        int expected = 24;
        int actual = solution.numSubmat(mat);
        assertEquals(expected, actual);
    }
}
