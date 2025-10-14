package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdjacentIncreasingSubarraysDetectionISolutionTest {
    AdjacentIncreasingSubarraysDetectionISolution solution = new AdjacentIncreasingSubarraysDetectionISolution();

    @Test
    public void hasIncreasingSubarraysTest_1() {
        List<Integer> nums = List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        int k = 3;
        boolean expected = true;
        boolean actual = solution.hasIncreasingSubarrays(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void hasIncreasingSubarraysTest_2() {
        List<Integer> nums = List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        int k = 5;
        boolean expected = false;
        boolean actual = solution.hasIncreasingSubarrays(nums, k);
        assertEquals(expected, actual);
    }
}
