package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMostFrequentVowelAndConsonantSolutionTest {
    FindMostFrequentVowelAndConsonantSolution solution = new FindMostFrequentVowelAndConsonantSolution();

    @Test
    public void findMostFrequentSum_1() {
        String s = "successes";
        int expected = 6;
        int actual = solution.maxFreqSum(s);
        assertEquals(expected, actual);
    }

    @Test
    public void findMostFrequentSum_2() {
        String s = "aieiaeia";
        int expected = 3;
        int actual = solution.maxFreqSum(s);
        assertEquals(expected, actual);
    }
}
