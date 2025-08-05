package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXSolutionTest {
    SqrtXSolution sol = new SqrtXSolution();

    @Test
    public void sqrtXTest_4() {
        int x = 4;
        int expected = 2;
        int result = sol.mySqrt(x);
        assertEquals(expected, result);
    }

    @Test
    public void sqrtXTest_8() {
        int x = 8;
        int expected = 2;
        int result = sol.mySqrt(x);
        assertEquals(expected, result);
    }

    @Test
    public void sqrtXTest_2147395599() {
        int x = 2147395599;
        int expected = 46329;
        int result = sol.mySqrt(x);
        assertEquals(expected, result);
    }
}
