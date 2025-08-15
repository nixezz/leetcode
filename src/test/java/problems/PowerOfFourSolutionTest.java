package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfFourSolutionTest {
    PowerOfFourSolution solution = new PowerOfFourSolution();

    @Test
    public void isPowerOfFour_16() {
        int n = 16;
        boolean expected = true;
        boolean actual = solution.isPowerOfFour(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isPowerOfFour_5() {
        int n = 5;
        boolean expected = false;
        boolean actual = solution.isPowerOfFour(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isPowerOfFour_1() {
        int n = 1;
        boolean expected = true;
        boolean actual = solution.isPowerOfFour(n);
        assertEquals(expected, actual);
    }
}
