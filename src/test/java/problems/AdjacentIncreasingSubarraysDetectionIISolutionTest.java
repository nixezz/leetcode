package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdjacentIncreasingSubarraysDetectionIISolutionTest {
    AdjacentIncreasingSubarraysDetectionIISolution solution = new AdjacentIncreasingSubarraysDetectionIISolution();

    @Test
    public void maxIncreasingSubarraysTest_1(){
        List<Integer> nums = List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        int expected = 3;
        int actual = solution.maxIncreasingSubarrays(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void maxIncreasingSubarraysTest_2(){
        List<Integer> nums = List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        int expected = 2;
        int actual = solution.maxIncreasingSubarrays(nums);
        assertEquals(expected, actual);
    }
}
