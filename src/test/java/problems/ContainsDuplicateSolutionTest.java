package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDuplicateSolutionTest {
    ContainsDuplicateSolution cds = new ContainsDuplicateSolution();

    @Test
    public void containsDuplicateTest_1231() {
        int[] nums = {1,2,3,1};
        boolean expected = true;
        boolean actual = cds.containsDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void containsDuplicateTest_1234() {
        int[] nums = {1,2,3,4};
        boolean expected = false;
        boolean actual = cds.containsDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void containsDuplicateTest_1113343242() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean expected = true;
        boolean actual = cds.containsDuplicate(nums);
        assertEquals(expected, actual);
    }
}
