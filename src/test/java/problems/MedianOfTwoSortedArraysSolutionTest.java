package problems;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class MedianOfTwoSortedArraysSolutionTest {
    private final MedianOfTwoSortedArraysSolution m = new MedianOfTwoSortedArraysSolution();

    @Disabled
    @Test
    public void testMedianOfTwoSortedArrays_first() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double expected = 2.0;
        double result = m.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result,
                "Test case with input " + Arrays.toString(nums1) + " and " + Arrays.toString(nums2) +" and expected " + expected + " failed.");
    }

    @Disabled
    @Test
    public void testMedianOfTwoSortedArrays_second() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double expected = 2.5;
        double result = m.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result,
                "Test case with input " + Arrays.toString(nums1) + " and " + Arrays.toString(nums2) +" and expected " + expected + " failed.");

    }
}
