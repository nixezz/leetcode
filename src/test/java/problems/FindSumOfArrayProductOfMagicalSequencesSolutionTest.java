package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSumOfArrayProductOfMagicalSequencesSolutionTest {
    FindSumOfArrayProductOfMagicalSequencesSolution solution = new FindSumOfArrayProductOfMagicalSequencesSolution();

    @Test
    public void magicalSumTest_1(){
        int m = 5, k = 5;
        int[] nums = {1, 10, 100, 1000, 1000000};
        int expected = 991600007;
        int actual = solution.magicalSum(m, k, nums);
        assertEquals(expected, actual);
    }

    @Test
    public void magicalSumTest_2(){
        int m = 2, k = 2;
        int[] nums = {5, 4, 3, 2, 1};
        int expected = 170;
        int actual = solution.magicalSum(m, k, nums);
        assertEquals(expected, actual);
    }

    @Test
    public void magicalSumTest_3(){
        int m = 1, k = 1;
        int[] nums = {28};
        int expected = 28;
        int actual = solution.magicalSum(m, k, nums);
        assertEquals(expected, actual);
    }

    @Test
    public void magicalSumTest_4(){
        int m = 10, k = 10;
        int[] nums = {63, 57, 1, 80, 13, 56};
        int expected = 28;
        int actual = solution.magicalSum(m, k, nums);
        assertEquals(expected, actual);
    }
}
