package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LexicographicallySmallestStringAfterApplyingOperationsSolutionTest {
    LexicographicallySmallestStringAfterApplyingOperationsSolution solution =
            new LexicographicallySmallestStringAfterApplyingOperationsSolution();

    @Test
    public void findLexSmallestStringTest_1(){
        String s = "5525";
        int a = 9;
        int b = 2;
        String expected = "2050";

        String actual = solution.findLexSmallestString(s, a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void findLexSmallestStringTest_2(){
        String s = "74";
        int a = 5;
        int b = 1;
        String expected = "24";

        String actual = solution.findLexSmallestString(s, a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void findLexSmallestStringTest_3(){
        String s = "0011";
        int a = 4;
        int b = 2;
        String expected = "0011";

        String actual = solution.findLexSmallestString(s, a, b);

        assertEquals(expected, actual);
    }
}
