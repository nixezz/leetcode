package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UglyNumberSolutionTest {
    UglyNumberSolution solution = new UglyNumberSolution();

    @Test
    public void isUglyNumberTest_6() {
        int n = 6;
        boolean expected = true;
        boolean actual = solution.isUgly(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isUglyNumberTest_1() {
        int n = 1;
        boolean expected = true;
        boolean actual = solution.isUgly(n);
        assertEquals(expected, actual);
    }

    @Test
    public void isUglyNumberTest_14() {
        int n = 14;
        boolean expected = false;
        boolean actual = solution.isUgly(n);
        assertEquals(expected, actual);
    }
}
