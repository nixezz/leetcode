package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMinimumAmountOfTimeToBrewPotionsSolutionTest {
    FindTheMinimumAmountOfTimeToBrewPotionsSolution solution = new FindTheMinimumAmountOfTimeToBrewPotionsSolution();

    @Test
    public void minTimeTest_1(){
        int[] skill = {1, 5, 2, 4};
        int[] mana = {5, 1, 4, 2};
        long expected = 110;
        long actual = solution.minTime(skill, mana);
        assertEquals(expected, actual);
    }

    @Test
    public void minTimeTest_2(){
        int[] skill = {1, 1, 1};
        int[] mana = {1, 1, 1};
        long expected = 5;
        long actual = solution.minTime(skill, mana);
        assertEquals(expected, actual);
    }

    @Test
    public void minTimeTest_3(){
        int[] skill = {1, 2, 3, 4};
        int[] mana = {1, 2};
        long expected = 21;
        long actual = solution.minTime(skill, mana);
        assertEquals(expected, actual);
    }
}
