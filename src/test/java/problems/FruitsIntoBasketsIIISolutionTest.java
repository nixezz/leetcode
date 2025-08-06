package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitsIntoBasketsIIISolutionTest {
    FruitsIntoBasketsIIISolution solution = new FruitsIntoBasketsIIISolution();

    @Test
    public void numOfUnplacedFruitsTest_425_354() {
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        int expected = 1;
        int result = solution.numOfUnplacedFruits(fruits, baskets);
        assertEquals(expected, result);
    }

    @Test
    public void numOfUnplacedFruitsTest_361_647() {
        int[] fruits = {3, 6, 1};
        int[] baskets = {6, 4, 7};
        int expected = 0;
        int result = solution.numOfUnplacedFruits(fruits, baskets);
        assertEquals(expected, result);
    }
}
