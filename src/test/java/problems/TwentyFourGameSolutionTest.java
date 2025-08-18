package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwentyFourGameSolutionTest {
    TwentyFourGameSolution solution = new TwentyFourGameSolution();

    @Test
    public void isTwentyFourTest_1() {
        int[] cards = {4, 1, 8, 7};
        boolean expected = true;
        boolean actual = solution.judgePoint24(cards);
        assertEquals(expected, actual);
    }

    @Test
    public void isTwentyFourTest_2() {
        int[] cards = {1, 2, 1, 2};
        boolean expected = false;
        boolean actual = solution.judgePoint24(cards);
        assertEquals(expected, actual);
    }
}
