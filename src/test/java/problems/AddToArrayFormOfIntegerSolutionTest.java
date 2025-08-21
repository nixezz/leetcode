package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToArrayFormOfIntegerSolutionTest {
    AddToArrayFormOfIntegerSolution solution = new AddToArrayFormOfIntegerSolution();

    @Test
    public void addTest_1200_34() {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = solution.addToArrayForm(num, k);
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void addTest_274_181() {
        int[] num = {2, 7, 4};
        int k = 181;
        List<Integer> expected = List.of(4, 5, 5);
        List<Integer> result = solution.addToArrayForm(num, k);
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void addTest_215_806() {
        int[] num = {2, 1, 5};
        int k = 806;
        List<Integer> expected = List.of(1, 0, 2, 1);
        List<Integer> result = solution.addToArrayForm(num, k);
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void addTest_bigNum_1() {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        List<Integer> expected = List.of(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        List<Integer> result = solution.addToArrayForm(num, k);
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void addTest_biggestNum_516() {
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        List<Integer> expected = List.of(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9);
        List<Integer> result = solution.addToArrayForm(num, k);
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }
}
