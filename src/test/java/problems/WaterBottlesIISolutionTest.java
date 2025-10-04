package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottlesIISolutionTest {
    WaterBottlesIISolution solution = new WaterBottlesIISolution();

    @Test
    public void maxBottlesDrunkTest_1(){
        int numBottles = 13;
        int numExchange = 6;
        int expected = 15;
        int actual = solution.maxBottlesDrunk(numBottles, numExchange);
        assertEquals(expected, actual);
    }

    @Test
    public void maxBottlesDrunkTest_2(){
        int numBottles = 10;
        int numExchange = 3;
        int expected = 13;
        int actual = solution.maxBottlesDrunk(numBottles, numExchange);
        assertEquals(expected, actual);
    }
}
