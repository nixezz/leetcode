package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortVowelsInAStringSolutionTest {
    SortVowelsInAStringSolution solution = new SortVowelsInAStringSolution();

    @Test
    public void sortVowelsTest_1() {
        String s = "lEetcOde";
        String expected = "lEOtcede";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }

    @Test
    public void sortVowelsTest_2() {
        String s = "lYmpH";
        String expected = "lYmpH";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }
}
