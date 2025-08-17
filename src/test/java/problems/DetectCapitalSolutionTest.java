package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetectCapitalSolutionTest {
    DetectCapitalSolution detectCapitalSolution = new DetectCapitalSolution();

    @Test
    public void detectCapitalSolutionTest_1() {
        String word = "USA";
        boolean expected = true;
        boolean actual = detectCapitalSolution.detectCapitalUse(word);
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalSolutionTest_2() {
        String word = "FlaG";
        boolean expected = false;
        boolean actual = detectCapitalSolution.detectCapitalUse(word);
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalSolutionTest_3() {
        String word = "ffffffffffffffffffffF";
        boolean expected = false;
        boolean actual = detectCapitalSolution.detectCapitalUse(word);
        assertEquals(expected, actual);
    }
}
