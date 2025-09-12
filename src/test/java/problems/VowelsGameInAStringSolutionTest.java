package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsGameInAStringSolutionTest {
    VowelsGameInAStringSolution solution = new VowelsGameInAStringSolution();

    @Test
    public void doesAliceWinTest_1(){
        String s = "leetcoder";
        boolean expected = true;
        boolean actual = solution.doesAliceWin(s);
        assertEquals(expected, actual);
    }

    @Test
    public void doesAliceWinTest_2(){
        String s = "bbcd";
        boolean expected = false;
        boolean actual = solution.doesAliceWin(s);
        assertEquals(expected, actual);
    }
}
