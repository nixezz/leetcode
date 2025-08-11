package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeProductQueriesOfPowersSolutionTest {
    RangeProductQueriesOfPowersSolution solution = new RangeProductQueriesOfPowersSolution();

    @Test
    public void rangeProductQueriesOfPowersTest_15_012203() {
        int n = 15;
        int[][] queries = {{0,1}, {2,2}, {0,3}};
        int[] expected = {2, 4, 64};
        int[] result = solution.productQueries(n, queries);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void rangeProductQueriesOfPowersTest_2_00() {
        int n = 22;
        int[][] queries = {{0,0}};
        int[] expected = {2};
        int[] result = solution.productQueries(n, queries);
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
