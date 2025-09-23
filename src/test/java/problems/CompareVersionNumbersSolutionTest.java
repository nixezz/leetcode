package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionNumbersSolutionTest {
    CompareVersionNumbersSolution solution = new CompareVersionNumbersSolution();

    @Test
    public void testCompareVersionNumbersTest_1() {
        String version1 = "1.2";
        String version2 = "1.10";
        int expected = -1;
        int actual = solution.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareVersionNumbersTest_2() {
        String version1 = "1.01";
        String version2 = "1.001";
        int expected = 0;
        int actual = solution.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareVersionNumbersTest_3() {
        String version1 = "1.0";
        String version2 = "1.0.0.0";
        int expected = 0;
        int actual = solution.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }
}
