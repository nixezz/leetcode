package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMaximumNumberOfFruitsCollectedSolutionTest {
    FindTheMaximumNumberOfFruitsCollectedSolution solution = new FindTheMaximumNumberOfFruitsCollectedSolution();

    @Test
    public void maxCollectedFruitsTest_1() {
        int[][] fruits = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int expected = 100;
        int actual = solution.maxCollectedFruits(fruits);
        assertEquals(expected, actual);
    }

    @Test
    public void maxCollectedFruitsTest_2() {
        int[][] fruits = new int[][] {{1,1},{1,1}};
        int expected = 4;
        int actual = solution.maxCollectedFruits(fruits);
        assertEquals(expected, actual);
    }
}
