package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestThreeSameDigitNumberInStringSolutionTest {
    LargestThreeSameDigitNumberInStringSolution solution = new LargestThreeSameDigitNumberInStringSolution();

    @Test
    public void largestGoodIntegerTest_6777133339(){
        String num = "6777133339";
        String expected = "777";
        String actual = solution.largestGoodInteger(num);
        assertEquals(expected, actual);
    }

    @Test
    public void largestGoodIntegerTest_2300019(){
        String num = "2300019";
        String expected = "000";
        String actual = solution.largestGoodInteger(num);
        assertEquals(expected, actual);
    }

    @Test
    public void largestGoodIntegerTest_42352338(){
        String num = "42352338";
        String expected = "";
        String actual = solution.largestGoodInteger(num);
        assertEquals(expected, actual);
    }
}
