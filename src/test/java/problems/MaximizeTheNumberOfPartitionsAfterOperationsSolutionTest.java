package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximizeTheNumberOfPartitionsAfterOperationsSolutionTest {
    MaximizeTheNumberOfPartitionsAfterOperationsSolution solution = new MaximizeTheNumberOfPartitionsAfterOperationsSolution();

    @Test
    public void maxPartitionsAfterOperationsTest_1(){
        String s = "accca";
        int k = 2;
        int expected = 3;
        int actual = solution.maxPartitionsAfterOperations(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void maxPartitionsAfterOperationsTest_2(){
        String s = "aabaab";
        int k = 3;
        int expected = 1;
        int actual = solution.maxPartitionsAfterOperations(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void maxPartitionsAfterOperationsTest_3(){
        String s = "xxyz";
        int k = 1;
        int expected = 4;
        int actual = solution.maxPartitionsAfterOperations(s, k);
        assertEquals(expected, actual);
    }
}
