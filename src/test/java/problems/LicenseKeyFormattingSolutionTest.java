package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LicenseKeyFormattingSolutionTest {
    LicenseKeyFormattingSolution solution = new LicenseKeyFormattingSolution();

    @Test
    public void licenseKeyFormattingTest_1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String expected = "5F3Z-2E9W";
        String actual = solution.licenseKeyFormatting(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void licenseKeyFormattingTest_2() {
        String s = "2-5g-3-J";
        int k = 2;
        String expected = "2-5G-3J";
        String actual = solution.licenseKeyFormatting(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void licenseKeyFormattingTest_3() {
        String s = "---";
        int k = 3;
        String expected = "";
        String actual = solution.licenseKeyFormatting(s, k);
        assertEquals(expected, actual);
    }
}
