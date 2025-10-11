package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTotalDamageWithSpellCastingSolutionTest {
    MaximumTotalDamageWithSpellCastingSolution solution = new MaximumTotalDamageWithSpellCastingSolution();

    @Test
    public void maximumTotalDamageTest_1(){
        int[] power = {1, 1, 3, 4};
        long expected = 6;
        long actual = solution.maximumTotalDamage(power);
        assertEquals(expected, actual);
    }

    @Test
    public void maximumTotalDamageTest_2(){
        int[] power = {7, 1, 6, 6};
        long expected = 13;
        long actual = solution.maximumTotalDamage(power);
        assertEquals(expected, actual);
    }
}
