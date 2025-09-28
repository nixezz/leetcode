package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPerimeterTriangleSolutionTest {
    LargestPerimeterTriangleSolution solution = new LargestPerimeterTriangleSolution();

    @Test
    public void largestPerimeterTest_1() {
        int[] nums = {2, 1, 2};
        int expected = 5;
        int actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void largestPerimeterTest_2() {
        int[] nums = {1, 2, 1, 10};
        int expected = 0;
        int actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }
}
