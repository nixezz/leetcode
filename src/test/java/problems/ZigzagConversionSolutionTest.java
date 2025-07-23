package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagConversionSolutionTest {
    ZigzagConversionSolution solution = new ZigzagConversionSolution();

    @Test
    public void zigzagConversionTest_first() {
        String inputString = "PAYPALISHIRING";
        int inputLength = 3;
        String expectedOutput = "PAHNAPLSIIGYIR";
        String result = solution.convert(inputString, inputLength);
        assertEquals(expectedOutput, result,
                "Test case with input " + inputString + " and " + inputLength +" and expected " + expectedOutput + " failed.");
    }

    @Test
    public void zigzagConversionTest_second() {
        String inputString = "PAYPALISHIRING";
        int inputLength = 4;
        String expectedOutput = "PINALSIGYAHRPI";
        String result = solution.convert(inputString, inputLength);
        assertEquals(expectedOutput, result,
                "Test case with input " + inputString + " and " + inputLength +" and expected " + expectedOutput + " failed.");
    }

    @Test
    public void zigzagConversionTest_third() {
        String inputString = "A";
        int inputLength = 1;
        String expectedOutput = "A";
        String result = solution.convert(inputString, inputLength);
        assertEquals(expectedOutput, result,
                "Test case with input " + inputString + " and " + inputLength +" and expected " + expectedOutput + " failed.");
    }
}
