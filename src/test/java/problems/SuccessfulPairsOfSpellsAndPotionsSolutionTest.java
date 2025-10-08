package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuccessfulPairsOfSpellsAndPotionsSolutionTest {
    SuccessfulPairsOfSpellsAndPotionsSolution solution = new SuccessfulPairsOfSpellsAndPotionsSolution();

    @Test
    public void successfulPairsTest_1(){
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        int success = 7;
        int[] expected = {4, 0, 3};
        int[] actual = solution.successfulPairs(spells, potions, success);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void successfulPairsTest_2(){
        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        int success = 16;
        int[] expected = {2, 0, 2};
        int[] actual = solution.successfulPairs(spells, potions, success);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
