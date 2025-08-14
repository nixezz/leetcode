package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsomorphicStringsSolutionTest {
    IsomorphicStringsSolution solution = new IsomorphicStringsSolution();

    @Test
    public void isIomorphicStringsTest_1() {
        String s = "egg";
        String t = "add";
        boolean expected = true;
        boolean actual = solution.isIsomorphic(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void isIomorphicStringsTest_2() {
        String s = "foo";
        String t = "bar";
        boolean expected = false;
        boolean actual = solution.isIsomorphic(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void isIomorphicStringsTest_3() {
        String s = "paper";
        String t = "title";
        boolean expected = true;
        boolean actual = solution.isIsomorphic(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void isIomorphicStringsTest_4() {
        String s = "badc";
        String t = "baba";
        boolean expected = false;
        boolean actual = solution.isIsomorphic(s, t);
        assertEquals(expected, actual);
    }
}
