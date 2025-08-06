package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnTitleSolutionTest {
    ExcelSheetColumnTitleSolution solution = new ExcelSheetColumnTitleSolution();

    @Test
    public void columnTitleTest_1() {
        int columnNumber = 1;
        String expected = "A";
        String result = solution.convertToTitle(columnNumber);
        assertEquals(expected, result);
    }

    @Test
    public void columnTitleTest_28() {
        int columnNumber = 28;
        String expected = "AB";
        String result = solution.convertToTitle(columnNumber);
        assertEquals(expected, result);
    }

    @Test
    public void columnTitleTest_701() {
        int columnNumber = 701;
        String expected = "ZY";
        String result = solution.convertToTitle(columnNumber);
        assertEquals(expected, result);
    }
}
