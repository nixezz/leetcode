package problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterSolutionTest {
    ContainerWithMostWaterSolution c = new ContainerWithMostWaterSolution();

    @Test
    public void test_49() {
        int[] input = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int result = c.maxArea(input);
        assertEquals(expected, result, "Test case with input " + Arrays.toString(input) + " and expected " + expected + " failed.");
    }

    @Test
    public void test_1() {
        int[] input = new int[]{1,1};
        int expected = 1;
        int result = c.maxArea(input);
        assertEquals(expected, result, "Test case with input " + Arrays.toString(input) + " and expected " + expected + " failed.");
    }
}
