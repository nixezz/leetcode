package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidWordSolutionTest {
    ValidWordSolution solution = new ValidWordSolution();

    @Test
    public void isValid_234Adas() {
        String input = "234Adas";
        boolean expected = true;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void isValid_b3() {
        String input = "b3";
        boolean expected = false;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void isValid_a3$e() {
        String input = "a3$e";
        boolean expected = false;
        boolean actual = solution.isValid(input);
        assertEquals(expected, actual);
    }
}
