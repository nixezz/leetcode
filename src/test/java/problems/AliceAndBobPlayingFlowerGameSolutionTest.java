package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AliceAndBobPlayingFlowerGameSolutionTest {
    AliceAndBobPlayingFlowerGameSolution solution = new AliceAndBobPlayingFlowerGameSolution();

    @Test
    public void flowerGameTest_1() {
        int n = 3, m = 2;
        long expected = 3;
        long actual = solution.flowerGame(n, m);
        assertEquals(expected, actual);
    }

    @Test
    public void flowerGameTest_2() {
        int n = 1, m = 1;
        long expected = 0;
        long actual = solution.flowerGame(n, m);
        assertEquals(expected, actual);
    }
}
