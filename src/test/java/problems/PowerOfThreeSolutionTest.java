package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfThreeSolutionTest {
    PowerOfThreeSolution solution = new PowerOfThreeSolution();

    @Test
    public void isPowerOfThreeTest_27() {
        int n = 27;
        boolean expected = true;
        boolean actual = solution.isPowerOfThree(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isPowerOfThreeTest_0() {
        int n = 0;
        boolean expected = false;
        boolean actual = solution.isPowerOfThree(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isPowerOfThreeTest_n1() {
        int n = -1;
        boolean expected = false;
        boolean actual = solution.isPowerOfThree(n);
        assertEquals(expected, actual);
    }
}
