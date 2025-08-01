package problems;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleSolutionTest {
    PascalsTriangleSolution solution = new PascalsTriangleSolution();

    @Test
    public void pascalTriangleTest_5() {
        int numRows = 5;
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        List<List<Integer>> result = solution.generate(numRows);
        assertEquals(expected, result);
    }

    @Test
    public void pascalTriangleTest_1() {
        int numRows = 1;
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        List<List<Integer>> result = solution.generate(numRows);
        assertEquals(expected, result);
    }
}
