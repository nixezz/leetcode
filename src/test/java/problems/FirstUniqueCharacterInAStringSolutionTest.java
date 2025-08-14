package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterInAStringSolutionTest {
    FirstUniqueCharacterInAStringSolution solution = new FirstUniqueCharacterInAStringSolution();

    @Test
    public void firstUniqChar_1() {
        String s = "leetcode";
        int expected = 0;
        int actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    public void firstUniqChar_2() {
        String s = "loveleetcode";
        int expected = 2;
        int actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    public void firstUniqChar_3() {
        String s = "aabb";
        int expected = -1;
        int actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }
}
