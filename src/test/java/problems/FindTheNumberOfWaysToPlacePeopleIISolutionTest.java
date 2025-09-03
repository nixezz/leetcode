package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheNumberOfWaysToPlacePeopleIISolutionTest {
    FindTheNumberOfWaysToPlacePeopleIISolution solution = new FindTheNumberOfWaysToPlacePeopleIISolution();

    @Test
    public void numberOfPairsTest_1() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        int expected = 0;
        int actual = solution.numberOfPairs(points);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfPairsTest_2() {
        int[][] points = {{6, 2}, {4, 4}, {2, 6}};
        int expected = 2;
        int actual = solution.numberOfPairs(points);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfPairsTest_3() {
        int[][] points = {{3, 1}, {1, 3}, {1, 1}};
        int expected = 2;
        int actual = solution.numberOfPairs(points);
        assertEquals(expected, actual);
    }
}
