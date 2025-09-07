package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNUniqueIntegersSumUpToZeroSolutionTest {
    FindNUniqueIntegersSumUpToZeroSolution solution = new FindNUniqueIntegersSumUpToZeroSolution();

    @Test
    public void sumZeroTest_1(){
        int n = 5;
        int[] expected = {0, 1, -1, 2, -2};
        int[] actual = solution.sumZero(n);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void sumZeroTest_2(){
        int n = 3;
        int[] expected = {0, 1, -1};
        int[] actual = solution.sumZero(n);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void sumZeroTest_3(){
        int n = 1;
        int[] expected = {0};
        int[] actual = solution.sumZero(n);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
