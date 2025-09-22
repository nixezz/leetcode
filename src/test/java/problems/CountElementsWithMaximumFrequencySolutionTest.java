package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountElementsWithMaximumFrequencySolutionTest {
    CountElementsWithMaximumFrequencySolution solution = new CountElementsWithMaximumFrequencySolution();

    @Test
    public void countElementsWithMaximumFrequencyTest_1(){
        int[] nums = {1, 2, 2, 3, 1, 4};
        int expected = 4;
        int actual = solution.maxFrequencyElements(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void countElementsWithMaximumFrequencyTest_2(){
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = solution.maxFrequencyElements(nums);
        assertEquals(expected, actual);
    }
}
