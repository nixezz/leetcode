package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsSolutionTest {
    ClimbingStairsSolution solution = new ClimbingStairsSolution();

    @Test
    public void climbStairsTest_2() {
        int n = 2;
        int expected = 2;
        int actual = solution.climbStairs(n);
        assertEquals(expected, actual);
    }

    @Test
    public void climbStairsTest_3() {
        int n = 3;
        int expected = 3;
        int actual = solution.climbStairs(n);
        assertEquals(expected, actual);
    }
}
