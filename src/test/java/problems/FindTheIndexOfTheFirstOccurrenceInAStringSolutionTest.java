package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheIndexOfTheFirstOccurrenceInAStringSolutionTest {
    FindTheIndexOfTheFirstOccurrenceInAStringSolution solution = new FindTheIndexOfTheFirstOccurrenceInAStringSolution();

    @Test
    public void strStr_1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        int result = solution.strStr(haystack, needle);
        assertEquals(expected, result);
    }

    @Test
    public void strStr_2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        int result = solution.strStr(haystack, needle);
        assertEquals(expected, result);
    }
}
