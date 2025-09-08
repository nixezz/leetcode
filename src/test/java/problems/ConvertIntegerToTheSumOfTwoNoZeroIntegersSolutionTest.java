package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersSolutionTest {
    ConvertIntegerToTheSumOfTwoNoZeroIntegersSolution solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegersSolution();

    @Test
    public void getSumOfTwoNoZeroIntegersTest_1() {
        int n = 2;
        int[] expected = {1, 1};
        int[] actual = solution.getNoZeroIntegers(n);
        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void getSumOfTwoNoZeroIntegersTest_2() {
        int n = 11;
        int[] expected = {2, 9};
        int[] actual = solution.getNoZeroIntegers(n);
        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}
