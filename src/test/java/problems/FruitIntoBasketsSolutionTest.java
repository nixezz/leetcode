package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitIntoBasketsSolutionTest {
    FruitIntoBasketsSolution solution = new FruitIntoBasketsSolution();

    @Test
    public void totalFruitTest_121() {
        int[] fruits = new int[]{1,2,1};
        int expected = 3;
        int result = solution.totalFruit(fruits);
        assertEquals(expected, result);
    }

    @Test
    public void totalFruitTest_0122() {
        int[] fruits = new int[]{0,1,2,2};
        int expected = 3;
        int result = solution.totalFruit(fruits);
        assertEquals(expected, result);
    }

    @Test
    public void totalFruitTest_12322() {
        int[] fruits = new int[]{1,2,3,2,2};
        int expected = 4;
        int result = solution.totalFruit(fruits);
        assertEquals(expected, result);
    }
}
