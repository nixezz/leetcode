package problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacificAtlanticWaterFlowSolutionTest {
    PacificAtlanticWaterFlowSolution solution = new PacificAtlanticWaterFlowSolution();

    @Test
    public void pacificAtlanticWaterFlowTest_1(){
        int[][] height = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 4),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 2),
                Arrays.asList(3, 0),
                Arrays.asList(3, 1),
                Arrays.asList(4, 0)
        );
        List<List<Integer>> actual = solution.pacificAtlantic(height);
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void pacificAtlanticWaterFlowTest_2(){
        int[][] height = {{1}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0)
        );
        List<List<Integer>> actual = solution.pacificAtlantic(height);
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}
