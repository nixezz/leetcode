package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSixtyNineNumberSolutionTest {
    MaximumSixtyNineNumberSolution solution = new MaximumSixtyNineNumberSolution();

    @Test
    public void maxNumberTest_9669() {
        int num = 9669;
        int expected = 9969;
        int result = solution.maximum69Number(num);
        assertEquals(expected, result);
    }

    @Test
    public void maxNumberTest_9996() {
        int num = 9996;
        int expected = 9999;
        int result = solution.maximum69Number(num);
        assertEquals(expected, result);
    }

    @Test
    public void maxNumberTest_9999() {
        int num = 9999;
        int expected = 9999;
        int result = solution.maximum69Number(num);
        assertEquals(expected, result);
    }
}
