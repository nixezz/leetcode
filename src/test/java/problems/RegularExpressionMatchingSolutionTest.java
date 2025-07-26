package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularExpressionMatchingSolutionTest {
    RegularExpressionMatchingSolution solution = new RegularExpressionMatchingSolution();

    @Test
    public void regexpmatchingTest_aa() {
        String s = "aa";
        String p = "a";
        boolean exp = false;
        boolean result = solution.isMatch(s, p);
        assertEquals(exp, result);
    }

    @Test
    public void regexpmatchingTest_as() {
        String s = "aa";
        String p = "a*";
        boolean exp = true;
        boolean result = solution.isMatch(s, p);
        assertEquals(exp, result);
    }

    @Test
    public void regexpmatchingTest_ab() {
        String s = "aa";
        String p = ".*";
        boolean exp = true;
        boolean result = solution.isMatch(s, p);
        assertEquals(exp, result);
    }
}
