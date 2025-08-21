package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseSevenSolutionTest {
    BaseSevenSolution solution = new BaseSevenSolution();

    @Test
    public void base7Test_100() {
        int num = 100;
        String expected = "202";
        String actual = solution.convertToBase7(num);
        assertEquals(expected, actual);
    }

    @Test
    public void base7Test_n7() {
        int num = -7;
        String expected = "-10";
        String actual = solution.convertToBase7(num);
        assertEquals(expected, actual);
    }

    @Test
    public void base7Test_0() {
        int num = 0;
        String expected = "0";
        String actual = solution.convertToBase7(num);
        assertEquals(expected, actual);
    }

    @Test
    public void base7Test_n8() {
        int num = -8;
        String expected = "-11";
        String actual = solution.convertToBase7(num);
        assertEquals(expected, actual);
    }
}
