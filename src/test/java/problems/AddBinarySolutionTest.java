package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinarySolutionTest {
    AddBinarySolution solution = new AddBinarySolution();

    @Test
    public void addBinaryTest_1(){
        String a = "11";
        String b = "1";
        String excepted = "100";
        String result = solution.addBinary(a, b);
        assertEquals(excepted, result);
    }

    @Test
    public void addBinaryTest_2(){
        String a = "1010";
        String b = "1011";
        String excepted = "10101";
        String result = solution.addBinary(a, b);
        assertEquals(excepted, result);
    }
}
