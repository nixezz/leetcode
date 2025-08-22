package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RansomNoteSolutionTest {
    RansomNoteSolution solution = new RansomNoteSolution();

    @Test
    public void ransomTest_1() {
        String ransomNote = "a";
        String magazine = "b";
        boolean expected = false;
        boolean result = solution.canConstruct(ransomNote, magazine);
        assertEquals(expected, result);
    }

    @Test
    public void ransomTest_2() {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean expected = false;
        boolean result = solution.canConstruct(ransomNote, magazine);
        assertEquals(expected, result);
    }

    @Test
    public void ransomTest_3() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean expected = true;
        boolean result = solution.canConstruct(ransomNote, magazine);
        assertEquals(expected, result);
    }
}
