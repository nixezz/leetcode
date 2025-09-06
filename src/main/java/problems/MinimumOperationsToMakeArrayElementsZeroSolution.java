package problems;

public class MinimumOperationsToMakeArrayElementsZeroSolution {
    private long get(int num){
        long counter = 0;
        int i = 1, base = 1;
        while (base <= num){
            int end = Math.min(base * 2 - 1, num);
            counter += (long) ((i + 1) / 2) * (end - base + 1);
            i++;
            base *= 2;
        }
        return counter;
    }

    public long minOperations(int[][] queries) {
        long result = 0;
        for(int[] query : queries) {
            long counter1 = get(query[1]);
            long counter2 = get(query[0] - 1);
            result += (counter1 - counter2 + 1) / 2;
        }

        return result;
    }
}
