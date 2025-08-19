package problems;

public class NumberOfZeroFilledSubarraysSolution {
    int TARGET = 0;

    public long zeroFilledSubarray(int[] nums) {
        long counter = 0;
        int zeroLength = 0;
        int length = nums.length;
        for (int i = 0; i <= length; i++) {
            if(i < length && nums[i] == TARGET) {
                zeroLength++;
            } else if(zeroLength > 0) {
                counter += (long) zeroLength * (zeroLength + 1) / 2;
                zeroLength = 0;
            }
        }
        return counter;
    }
}
