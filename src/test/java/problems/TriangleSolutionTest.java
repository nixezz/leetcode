package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleSolutionTest {
    TriangleSolution solution = new TriangleSolution();

    @Test
    public void testTriangle_1() {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        int expected = 11;
        int actual = solution.minimumTotal(triangle);
        assertEquals(expected, actual);
    }

    @Test
    public void testTriangle_2() {
        List<List<Integer>> triangle = List.of(
                List.of(-10)
        );
        int expected = -10;
        int actual = solution.minimumTotal(triangle);
        assertEquals(expected, actual);
    }
}
