package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceNonCoprimeNumbersInArraySolutionTest {
    ReplaceNonCoprimeNumbersInArraySolution solution = new ReplaceNonCoprimeNumbersInArraySolution();

    @Test
    public void replaceNonCoprimesTest_1(){
        int[] nums = {6, 4, 3, 2, 7, 6, 2};
        List<Integer> expected = List.of(12, 7, 6);
        List<Integer> actual = solution.replaceNonCoprimes(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void replaceNonCoprimesTest_2(){
        int[] nums = {2, 2, 1, 1, 3, 3, 3};
        List<Integer> expected = List.of(2, 1, 1, 3);
        List<Integer> actual = solution.replaceNonCoprimes(nums);
        assertEquals(expected, actual);
    }
}
