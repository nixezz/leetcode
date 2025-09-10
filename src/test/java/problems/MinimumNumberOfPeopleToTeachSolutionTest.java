package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfPeopleToTeachSolutionTest {
    MinimumNumberOfPeopleToTeachSolution solution = new MinimumNumberOfPeopleToTeachSolution();

    @Test
    public void minimumTeachingPeopleTest_1(){
        int n = 2;
        int[][] languages = {{1}, {2}, {1, 2}};
        int[][] friendships = {{1, 2}, {1, 3}};
        int expected = 1;
        int actual = solution.minimumTeachings(n, languages, friendships);
        assertEquals(expected, actual);
    }

    @Test
    public void minimumTeachingPeopleTest_2(){
        int n = 3;
        int[][] languages = {{2}, {1, 3}, {1, 2}, {3}};
        int[][] friendships = {{1, 4}, {1, 2}, {3, 4}, {2, 3}};
        int expected = 2;
        int actual = solution.minimumTeachings(n, languages, friendships);
        assertEquals(expected, actual);
    }
}
