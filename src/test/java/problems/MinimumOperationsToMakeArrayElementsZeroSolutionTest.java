package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToMakeArrayElementsZeroSolutionTest {
    MinimumOperationsToMakeArrayElementsZeroSolution solution = new MinimumOperationsToMakeArrayElementsZeroSolution();

    @Test
    public void minOperationsTest_1() {
        int[][] queries = {{1, 2}, {2, 4}};
        long expected = 3;
        long actual = solution.minOperations(queries);
        assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest_2() {
        int[][] queries = {{2, 6}};
        long expected = 4;
        long actual = solution.minOperations(queries);
        assertEquals(expected, actual);
    }
}
