package problems;

public class MinimumOperationsToMakeTheIntegerZeroSolution {
     public int makeTheIntegerZero(int num1, int num2) {
        for (int i = 1; i <= 60; i++) {
            long x = (long) num1 - (long) i * num2;

            if(x < 0) break;
            int bitCount = Long.bitCount(x);

            if(bitCount <= i && i <= x){
                return i;
            }
        }

        return -1;
    }
}
