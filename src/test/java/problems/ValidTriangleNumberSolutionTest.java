package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidTriangleNumberSolutionTest {
    ValidTriangleNumberSolution solution = new ValidTriangleNumberSolution();

    @Test
    public void triangleNumberTest_1(){
        int[] nums = {2, 2, 3, 4};
        int expected = 3;
        int actual = solution.triangleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void triangleNumberTest_2(){
        int[] nums = {4, 2, 3, 4};
        int expected = 4;
        int actual = solution.triangleNumber(nums);
        assertEquals(expected, actual);
    }
}
