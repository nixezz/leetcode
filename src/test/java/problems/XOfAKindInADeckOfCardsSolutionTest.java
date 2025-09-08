package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XOfAKindInADeckOfCardsSolutionTest {
    XOfAKindInADeckOfCardsSolution solution = new XOfAKindInADeckOfCardsSolution();

    @Test
    public void groupSizeXTest_1(){
        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean expected = true;
        boolean actual = solution.hasGroupsSizeX(deck);
        assertEquals(expected, actual);
    }

    @Test
    public void groupSizeXTest_2(){
        int[] deck = {1, 1, 1, 2, 2, 2, 3, 3};
        boolean expected = false;
        boolean actual = solution.hasGroupsSizeX(deck);
        assertEquals(expected, actual);
    }
}
