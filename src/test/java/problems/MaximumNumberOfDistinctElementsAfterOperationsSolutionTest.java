package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfDistinctElementsAfterOperationsSolutionTest {
    MaximumNumberOfDistinctElementsAfterOperationsSolution solution = new MaximumNumberOfDistinctElementsAfterOperationsSolution();

    @Test
    public void maxDistinctElementsTest_1(){
        int[] nums = {1, 2, 2, 3, 3, 4};
        int k = 2;
        int expected = 6;
        int actual = solution.maxDistinctElements(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void maxDistinctElementsTest_2(){
        int[] nums = {4, 4, 4, 4};
        int k = 1;
        int expected = 3;
        int actual = solution.maxDistinctElements(nums, k);
        assertEquals(expected, actual);
    }
}
