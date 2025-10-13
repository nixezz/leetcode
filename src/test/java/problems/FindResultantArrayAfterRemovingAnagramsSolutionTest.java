package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindResultantArrayAfterRemovingAnagramsSolutionTest {
    FindResultantArrayAfterRemovingAnagramsSolution solution = new FindResultantArrayAfterRemovingAnagramsSolution();

    @Test
    public void removeAnagramsTest_1() {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        List<String> expected = List.of("abba", "cd");
        List<String> actual = solution.removeAnagrams(words);
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void removeAnagramsTest_2() {
        String[] words = {"a", "b", "c", "d", "e"};
        List<String> expected = List.of("a", "b", "c", "d", "e");
        List<String> actual = solution.removeAnagrams(words);
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}
