package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheOriginalTypedStringISolutionTest {
    FindTheOriginalTypedStringISolution solution = new FindTheOriginalTypedStringISolution();

    @Test
    public void findOriginalTypedString_abcd() {
        String input = "abcd";
        int expected = 1;
        int result = solution.possibleStringCount(input);
        assertEquals(expected, result);
    }

    @Test
    public void findOriginalTypedString_aaaa() {
        String input = "aaaa";
        int expected = 4;
        int result = solution.possibleStringCount(input);
        assertEquals(expected, result);
    }

    @Test
    public void findOriginalTypedString_abbcccc() {
        String input = "abbcccc";
        int expected = 5;
        int result = solution.possibleStringCount(input);
        assertEquals(expected, result);
    }

    @Test
    public void findOriginalTypedString_ere() {
        String input = "ere";
        int expected = 1;
        int result = solution.possibleStringCount(input);
        assertEquals(expected, result);
    }
}
