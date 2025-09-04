package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindClosestPersonSolutionTest {
    FindClosestPersonSolution solution = new FindClosestPersonSolution();

    @Test
    public void findClosestPersonTest_1() {
        int x = 2, y = 7, z = 4;
        int expected = 1;
        int actual = solution.findClosest(x, y, z);
        assertEquals(expected, actual);
    }

    @Test
    public void findClosestPersonTest_2() {
        int x = 2, y = 5, z = 6;
        int expected = 2;
        int actual = solution.findClosest(x, y, z);
        assertEquals(expected, actual);
    }

    @Test
    public void findClosestPersonTest_3() {
        int x = 1, y = 5, z = 3;
        int expected = 0;
        int actual = solution.findClosest(x, y, z);
        assertEquals(expected, actual);
    }
}
