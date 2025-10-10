package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TakingMaximumEnergyFromTheMysticDungeonSolutionTest {
    TakingMaximumEnergyFromTheMysticDungeonSolution solution = new TakingMaximumEnergyFromTheMysticDungeonSolution();

    @Test
    public void maximumEnergyTest_1() {
        int[] energy = {5, 2, -10, -5, 1};
        int k = 3;
        int expected = 3;
        int actual = solution.maximumEnergy(energy, k);
        assertEquals(expected, actual);
    }

    @Test
    public void maximumEnergyTest_2() {
        int[] energy = {-2, -3, -1};
        int k = 2;
        int expected = -1;
        int actual = solution.maximumEnergy(energy, k);
        assertEquals(expected, actual);
    }
}
