package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionToRecurringDecimalSolutionTest {
    FractionToRecurringDecimalSolution solution = new FractionToRecurringDecimalSolution();

    @Test
    public void fractionToDecimalTest_1() {
        int numerator = 1;
        int denominator = 2;
        String expected = "0.5";
        String actual = solution.fractionToDecimal(numerator, denominator);
        assertEquals(expected, actual);
    }

    @Test
    public void fractionToDecimalTest_2() {
        int numerator = 2;
        int denominator = 1;
        String expected = "2";
        String actual = solution.fractionToDecimal(numerator, denominator);
        assertEquals(expected, actual);
    }

    @Test
    public void fractionToDecimalTest_3() {
        int numerator = 4;
        int denominator = 333;
        String expected = "0.(012)";
        String actual = solution.fractionToDecimal(numerator, denominator);
        assertEquals(expected, actual);
    }
}
