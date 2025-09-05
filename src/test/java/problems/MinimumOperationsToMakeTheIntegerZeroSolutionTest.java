package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToMakeTheIntegerZeroSolutionTest {
    MinimumOperationsToMakeTheIntegerZeroSolution solution = new MinimumOperationsToMakeTheIntegerZeroSolution();

    @Test
    public void makeTheIntegerZeroSolutionTest_1() {
        int num1 = 3, num2 = -2;
        int expected = 3;
        int actual = solution.makeTheIntegerZero(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void makeTheIntegerZeroSolutionTest_2() {
        int num1 = 5, num2 = 7;
        int expected = -1;
        int actual = solution.makeTheIntegerZero(num1, num2);
        assertEquals(expected, actual);
    }
}
