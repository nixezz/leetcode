package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringSolutionTest {
    ReverseStringSolution solution = new ReverseStringSolution();

    @Test
    public void reverseTest_1(){
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        solution.reverseString(s);
        assertEquals(expected.length, s.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], s[i]);
        }
    }
}
