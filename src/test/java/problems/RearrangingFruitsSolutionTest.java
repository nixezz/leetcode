package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RearrangingFruitsSolutionTest {
    RearrangingFruitsSolution solution = new RearrangingFruitsSolution();

    @Test
    public void rearrangeFruits_1() {
        int[] basket1 = new int[]{4, 2, 2, 2};
        int[] basket2 = new int[]{1, 4, 1, 2};
        int expected = 1;
        long result = solution.minCost(basket1, basket2);
        assertEquals(expected, result);
    }

    @Test
    public void rearrangeFruits_n1() {
        int[] basket1 = new int[]{2, 3, 4, 1};
        int[] basket2 = new int[]{3, 2, 5, 1};
        int expected = -1;
        long result = solution.minCost(basket1, basket2);
        assertEquals(expected, result);
    }
}
