package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementSolutionTest {
    MajorityElementSolution solution = new MajorityElementSolution();

    @Test
    public void majorityElementTest_1() {
        int[] nums = {3, 2, 3};
        int expected = 3;
        int actual = solution.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void majorityElementTest_2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        int actual = solution.majorityElement(nums);
        assertEquals(expected, actual);
    }
}
