package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTotalNumberOfColoredCellsSolutionTest {
    CountTotalNumberOfColoredCellsSolution solution = new CountTotalNumberOfColoredCellsSolution();

    @Test
    public void countTotalNumberOfColoredCells_n1() {
        int n = 1;
        long expected = 1;
        long result = solution.coloredCells(n);
        assertEquals(expected, result);
    }

    @Test
    public void countTotalNumberOfColoredCells_n2() {
        int n = 2;
        long expected = 5;
        long result = solution.coloredCells(n);
        assertEquals(expected, result);
    }

    @Test
    public void countTotalNumberOfColoredCells_n3() {
        int n = 3;
        long expected = 13;
        long result = solution.coloredCells(n);
        assertEquals(expected, result);
    }
}
