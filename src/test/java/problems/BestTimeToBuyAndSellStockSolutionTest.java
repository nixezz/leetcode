package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockSolutionTest {
    BestTimeToBuyAndSellStockSolution solution = new BestTimeToBuyAndSellStockSolution();

    @Test
    public void maxProfitTest_have() {
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitTest_zero() {
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
}
