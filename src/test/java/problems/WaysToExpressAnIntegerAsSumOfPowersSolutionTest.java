package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaysToExpressAnIntegerAsSumOfPowersSolutionTest {
    WaysToExpressAnIntegerAsSumOfPowersSolution solution = new WaysToExpressAnIntegerAsSumOfPowersSolution();

    @Test
    public void waysToExpressAnIntegerAsSumOfPowersTest_10_2() {
        int n = 10;
        int x = 2;
        int expected = 1;
        int result = solution.numberOfWays(n, x);
        assertEquals(expected, result);
    }

    @Test
    public void waysToExpressAnIntegerAsSumOfPowersTest_4_1() {
        int n = 4;
        int x = 1;
        int expected = 2;
        int result = solution.numberOfWays(n, x);
        assertEquals(expected, result);
    }
}
