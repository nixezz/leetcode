package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionSolutionTest {
    SearchInsertPositionSolution solution = new SearchInsertPositionSolution();

    @Test
    public void searchInsert_1() {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        int expected = 2;
        int result = solution.searchInsert(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void searchInsert_2() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        int expected = 1;
        int result = solution.searchInsert(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void searchInsert_3() {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        int expected = 4;
        int result = solution.searchInsert(nums, target);
        assertEquals(expected, result);
    }
}
