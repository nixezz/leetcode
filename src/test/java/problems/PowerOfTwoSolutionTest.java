package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoSolutionTest {
    PowerOfTwoSolution solution = new PowerOfTwoSolution();

    @Test
    public void isPowerOfTwoTest_1(){
        int n = 1;
        boolean expected = true;
        boolean actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isPowerOfTwoTest_16(){
        int n = 16;
        boolean expected = true;
        boolean actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isPowerOfTwoTest_3(){
        int n = 3;
        boolean expected = false;
        boolean actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }
}
