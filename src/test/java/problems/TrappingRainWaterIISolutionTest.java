package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterIISolutionTest {
    TrappingRainWaterIISolution solution = new TrappingRainWaterIISolution();

    @Test
    public void trapRainWaterTest_1(){
        int[][] heightMap = {
                {1, 4, 3, 1, 3, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1}
        };
        int expected = 4;
        int actual = solution.trapRainWater(heightMap);
        assertEquals(expected, actual);
    }

    @Test
    public void trapRainWaterTest_2(){
        int[][] heightMap = {
                {3, 3, 3, 3, 3},
                {3, 2, 2, 2, 3},
                {3, 2, 1, 2, 3},
                {3, 2, 2, 2, 3},
                {3, 3, 3, 3, 3}
        };
        int expected = 10;
        int actual = solution.trapRainWater(heightMap);
        assertEquals(expected, actual);
    }
}
