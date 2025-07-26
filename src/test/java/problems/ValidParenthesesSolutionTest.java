package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesSolutionTest {
    ValidParenthesesSolution solution = new ValidParenthesesSolution();

    @Test
    public void validParentheses_1() {
        String input = "()";
        boolean expected = true;
        boolean result = solution.isValid(input);
        assertEquals(expected, result, "Test case with input " + input + " failed.");
    }

    @Test
    public void validParentheses_2() {
        String input = "()[]{}";
        boolean expected = true;
        boolean result = solution.isValid(input);
        assertEquals(expected, result, "Test case with input " + input + " failed.");
    }

    @Test
    public void validParentheses_3() {
        String input = "(]";
        boolean expected = false;
        boolean result = solution.isValid(input);
        assertEquals(expected, result, "Test case with input " + input + " failed.");
    }

    @Test
    public void validParentheses_4() {
        String input = "([])";
        boolean expected = true;
        boolean result = solution.isValid(input);
        assertEquals(expected, result, "Test case with input " + input + " failed.");
    }

    @Test
    public void validParentheses_5() {
        String input = "([)]";
        boolean expected = false;
        boolean result = solution.isValid(input);
        assertEquals(expected, result, "Test case with input " + input + " failed.");
    }
}
