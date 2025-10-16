package problems;

public class SmallestMissingNonNegativeIntegerAfterOperationsSolution {
    public int findSmallestInteger(int[] nums, int value) {
        int result = 0;
        int[] rem = new int[value];
        for(int x : nums){
            int r = ((x % value) + value) % value;
            rem[r]++;
        }
        while (rem[result % value]-- > 0){
            result++;
        }
        return result;
    }
}
