package problems;

public class PowerOfThreeSolution {
    public boolean isPowerOfThree(int n) {
        // MAX INT VALUE = 1162261467
        return (n > 0) && (1162261467 % n == 0);
    }
}
