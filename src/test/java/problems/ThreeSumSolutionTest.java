package problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreeSumSolutionTest {
    ThreeSumSolution solution = new ThreeSumSolution();

    @Test
    public void threeSumTest_2triplets() {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );

        List<List<Integer>> result = solution.threeSum(input);
        assertEquals(expected.size(), result.size(), "The sizes don't match");

        for (List<Integer> triplet : expected) {
            assertTrue(result.contains(triplet), "Expected triple " + triplet + " missing in result");
        }

        for (List<Integer> triplet : result) {
            assertTrue(expected.contains(triplet), "Unexpected triple " + triplet + " as a result");
        }
    }
}
