package problems;

public class FindNUniqueIntegersSumUpToZeroSolution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int id = 0;
        for (int i = 1; i <= n / 2; ++i) {
            result[id++] = -i;
            result[id++] = i;
        }
        if(n % 2 == 1){
            result[id] = 0;

        }
        return result;
    }
}
