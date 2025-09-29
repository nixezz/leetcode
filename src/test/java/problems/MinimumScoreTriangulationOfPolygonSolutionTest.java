package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumScoreTriangulationOfPolygonSolutionTest {
    MinimumScoreTriangulationOfPolygonSolution solution = new MinimumScoreTriangulationOfPolygonSolution();

    @Test
    public void getMinScoreTest_1(){
        int[] values = {1, 2, 3};
        int expected = 6;
        int actual = solution.minScoreTriangulation(values);
        assertEquals(expected, actual);
    }

    @Test
    public void getMinScoreTest_2(){
        int[] values = {3, 7, 4, 5};
        int expected = 144;
        int actual = solution.minScoreTriangulation(values);
        assertEquals(expected, actual);
    }

    @Test
    public void getMinScoreTest_3(){
        int[] values = {1, 3, 1, 4, 1, 5};
        int expected = 13;
        int actual = solution.minScoreTriangulation(values);
        assertEquals(expected, actual);
    }
}
