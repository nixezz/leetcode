package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfPeopleAwareOfASecretSolutionTest {
    NumberOfPeopleAwareOfASecretSolution solution = new NumberOfPeopleAwareOfASecretSolution();

    @Test
    public void numberOfPeopleAwareOfASecretTest_1() {
        int n = 6, delay = 2, forget = 4;
        int expected = 5;
        int actual = solution.peopleAwareOfSecret(n, delay, forget);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfPeopleAwareOfASecretTest_2() {
        int n = 4, delay = 1, forget = 3;
        int expected = 6;
        int actual = solution.peopleAwareOfSecret(n, delay, forget);
        assertEquals(expected, actual);
    }
}
