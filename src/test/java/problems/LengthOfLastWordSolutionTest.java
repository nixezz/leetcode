package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordSolutionTest {
    LengthOfLastWordSolution solution = new LengthOfLastWordSolution();

    @Test
    public void lengthOfLastWord_1() {
        String input = "Hello World";
        int expected = 5;
        int result = solution.lengthOfLastWord(input);
        assertEquals(expected, result);
    }

    @Test
    public void lengthOfLastWord_2() {
        String input = "   fly me   to   the moon  ";
        int expected = 4;
        int result = solution.lengthOfLastWord(input);
        assertEquals(expected, result);
    }

    @Test
    public void lengthOfLastWord_3() {
        String input = "luffy is still joyboy";
        int expected = 6;
        int result = solution.lengthOfLastWord(input);
        assertEquals(expected, result);
    }
}
