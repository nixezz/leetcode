package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsSolutionTest {
    AddDigitsSolution solution = new AddDigitsSolution();

    @Test
    public void testAddDigits_38() {
        int input = 38;
        int expected = 2;
        int actual = solution.addDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDigits_0() {
        int input = 0;
        int expected = 0;
        int actual = solution.addDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDigits_1() {
        int input = 1;
        int expected = 1;
        int actual = solution.addDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDigits_11() {
        int input = 11;
        int expected = 2;
        int actual = solution.addDigits(input);
        assertEquals(expected, actual);
    }
}
