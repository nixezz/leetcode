package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderedPowerOfTwoSolutionTest {
    ReorderedPowerOfTwoSolution solution = new ReorderedPowerOfTwoSolution();

    @Test
    public void reorderedPowerOfTwoTest_1() {
        int n = 1;
        boolean expected = true;
        boolean result = solution.reorderedPowerOf2(n);
        assertEquals(expected, result);
    }

    @Test
    public void reorderedPowerOfTwoTest_10() {
        int n = 10;
        boolean expected = false;
        boolean result = solution.reorderedPowerOf2(n);
        assertEquals(expected, result);
    }
}
