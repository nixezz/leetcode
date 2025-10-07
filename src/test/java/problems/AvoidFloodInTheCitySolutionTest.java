package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvoidFloodInTheCitySolutionTest {
    AvoidFloodInTheCitySolution solution = new AvoidFloodInTheCitySolution();

    @Test
    public void avoidFloodTest_1() {
        int[] rains = {1, 2, 3, 4};
        int[] expected = {-1, -1, -1, -1};
        int[] actual = solution.avoidFlood(rains);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void avoidFloodTest_2() {
        int[] rains = {1, 2, 0, 0, 2, 1};
        int[] expected = {-1, -1, 2, 1, -1, -1};
        int[] actual = solution.avoidFlood(rains);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void avoidFloodTest_3() {
        int[] rains = {1, 2, 0, 1, 2};
        int[] expected = {};
        int[] actual = solution.avoidFlood(rains);
        assertEquals(expected.length, actual.length);
    }
}
