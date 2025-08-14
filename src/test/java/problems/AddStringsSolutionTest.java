package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddStringsSolutionTest {
    AddStringsSolution solution = new AddStringsSolution();

    @Test
    public void addStringsTest_11_123() {
        String num1 = "11";
        String num2 = "123";
        String expected = "134";
        String actual = solution.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void addStringsTest_456_77() {
        String num1 = "456";
        String num2 = "77";
        String expected = "533";
        String actual = solution.addStrings(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void addStringsTest_0_0() {
        String num1 = "0";
        String num2 = "0";
        String expected = "0";
        String actual = solution.addStrings(num1, num2);
        assertEquals(expected, actual);
    }
}
