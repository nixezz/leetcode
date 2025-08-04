package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberSolutionTest {
    FibonacciNumberSolution solution = new FibonacciNumberSolution();

    @Test
    public void fibonacciNumberTest_2() {
        int n = 2;
        int expected = 1;
        int result = solution.fib(n);
        assertEquals(expected, result);
    }

    @Test
    public void fibonacciNumberTest_3() {
        int n = 3;
        int expected = 2;
        int result = solution.fib(n);
        assertEquals(expected, result);
    }

    @Test
    public void fibonacciNumberTest_4() {
        int n = 4;
        int expected = 3;
        int result = solution.fib(n);
        assertEquals(expected, result);
    }
}
