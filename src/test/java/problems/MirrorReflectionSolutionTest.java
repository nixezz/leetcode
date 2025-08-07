package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorReflectionSolutionTest {
    MirrorReflectionSolution solution = new MirrorReflectionSolution();

    @Test
    public void testMirrorReflection_p2_q1() {
        int p = 2, q = 1;
        int expected = 2;
        int result = solution.mirrorReflection(p, q);
        assertEquals(expected, result);
    }

    @Test
    public void testMirrorReflection_p3_q1() {
        int p = 3, q = 1;
        int expected = 1;
        int result = solution.mirrorReflection(p, q);
        assertEquals(expected, result);
    }
}
