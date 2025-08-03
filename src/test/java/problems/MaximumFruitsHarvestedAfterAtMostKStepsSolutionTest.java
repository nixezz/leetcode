package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumFruitsHarvestedAfterAtMostKStepsSolutionTest {
    MaximumFruitsHarvestedAfterAtMostKStepsSolution solution = new MaximumFruitsHarvestedAfterAtMostKStepsSolution();

    @Test
    public void maximumFruitsHarvestedAfterAtMostK_1() {
        int[][] fruits = new int[][] {{2,8}, {6,3}, {8,6}};
        int startPos = 5;
        int k = 4;
        int expected = 9;
        int result = solution.maxTotalFruits(fruits, startPos, k);
        assertEquals(expected, result);
    }

    @Test
    public void maximumFruitsHarvestedAfterAtMostK_2() {
        int[][] fruits = new int[][] {{0,9}, {4,1}, {5,7}, {6,2}, {7,4}, {10,9}};
        int startPos = 5;
        int k = 4;
        int expected = 14;
        int result = solution.maxTotalFruits(fruits, startPos, k);
        assertEquals(expected, result);
    }

    @Test
    public void maximumFruitsHarvestedAfterAtMostK_3() {
        int[][] fruits = new int[][] {{0,3}, {6,4}, {8,5}};
        int startPos = 3;
        int k = 2;
        int expected = 0;
        int result = solution.maxTotalFruits(fruits, startPos, k);
        assertEquals(expected, result);
    }
}
