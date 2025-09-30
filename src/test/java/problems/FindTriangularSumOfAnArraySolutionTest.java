package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTriangularSumOfAnArraySolutionTest {
    FindTriangularSumOfAnArraySolution solution = new FindTriangularSumOfAnArraySolution();

    @Test
    public void findTriangularSumTest_1() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 8;
        int actual = solution.triangularSum(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void findTriangularSumTest_2() {
        int[] nums = {5};
        int expected = 5;
        int actual = solution.triangularSum(nums);
        assertEquals(expected, actual);
    }
}
