package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewTwentyOneGameSolutionTest {
    NewTwentyOneGameSolution solution = new NewTwentyOneGameSolution();

    @Test
    public void modulateGame_1() {
        int n = 10;
        int k = 1;
        int maxPts = 10;
        double expected = 1.00;
        double actual = solution.new21Game(n, k, maxPts);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void modulateGame_2() {
        int n = 6;
        int k = 1;
        int maxPts = 10;
        double expected = 0.6;
        double actual = solution.new21Game(n, k, maxPts);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void modulateGame_3() {
        int n = 21;
        int k = 17;
        int maxPts = 10;
        double expected = 0.73;
        double actual = solution.new21Game(n, k, maxPts);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void modulateGame_4() {
        int n = 5483;
        int k = 1895;
        int maxPts = 5252;
        double expected = 0.73;
        double actual = solution.new21Game(n, k, maxPts);
        assertEquals(expected, actual, 0.1);
    }
}
