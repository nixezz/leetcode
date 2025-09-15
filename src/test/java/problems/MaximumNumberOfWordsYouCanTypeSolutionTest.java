package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfWordsYouCanTypeSolutionTest {
    MaximumNumberOfWordsYouCanTypeSolution solution = new MaximumNumberOfWordsYouCanTypeSolution();

    @Test
    public void checkTypedWordsTest_1(){
        String text = "hello world";
        String brokenLetters = "ad";
        int expected = 1;
        int actual = solution.canBeTypedWords(text, brokenLetters);
        assertEquals(expected, actual);
    }

    @Test
    public void checkTypedWordsTest_2(){
        String text = "leet code";
        String brokenLetters = "lt";
        int expected = 1;
        int actual = solution.canBeTypedWords(text, brokenLetters);
        assertEquals(expected, actual);
    }

    @Test
    public void checkTypedWordsTest_3(){
        String text = "leet code";
        String brokenLetters = "e";
        int expected = 0;
        int actual = solution.canBeTypedWords(text, brokenLetters);
        assertEquals(expected, actual);
    }
}
