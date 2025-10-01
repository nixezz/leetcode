package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottlesSolutionTest {
    WaterBottlesSolution solution = new WaterBottlesSolution();

    @Test
    public void numWaterBottlesTest_1(){
        int numBottles = 9;
        int numExchange = 3;
        int expected = 13;
        int actual = solution.numWaterBottles(numBottles, numExchange);
        assertEquals(expected, actual);
    }

    @Test
    public void numWaterBottlesTest_2(){
        int numBottles = 15;
        int numExchange = 4;
        int expected = 19;
        int actual = solution.numWaterBottles(numBottles, numExchange);
        assertEquals(expected, actual);
    }
}
