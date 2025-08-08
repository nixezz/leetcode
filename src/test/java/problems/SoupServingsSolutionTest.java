package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoupServingsSolutionTest {
    SoupServingsSolution solution = new SoupServingsSolution();

    @Test
    public void servingTest_50() {
        int n = 50;
        double expected = 0.625;
        double result = solution.soupServings(n);
        assertEquals(expected, result);
    }

    @Test
    public void servingTest_100() {
        int n = 100;
        double expected = 0.71875;
        double result = solution.soupServings(n);
        assertEquals(expected, result);
    }
}
