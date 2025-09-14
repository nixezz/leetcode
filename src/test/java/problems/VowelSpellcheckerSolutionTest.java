package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelSpellcheckerSolutionTest {
    VowelSpellcheckerSolution solution = new VowelSpellcheckerSolution();

    @Test
    public void testSpellchecker_1() {
        String[] wordlist = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        String[] expected = {"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"};
        String[] actual = solution.spellchecker(wordlist, queries);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testSpellchecker_2() {
        String[] wordlist = {"yellow"};
        String[] queries = {"YellOw"};
        String[] expected = {"yellow"};
        String[] actual = solution.spellchecker(wordlist, queries);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
