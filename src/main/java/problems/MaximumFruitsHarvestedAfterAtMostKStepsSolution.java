package problems;

public class MaximumFruitsHarvestedAfterAtMostKStepsSolution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = 0, right = 0, sum = 0, answer = 0;
        int n = fruits.length;

        while (right < n) {
            sum += fruits[right][1];

            while (left <= right && step(fruits, startPos, left, right) > k){
                sum -= fruits[left][1];
                left++;
            }
            answer = Math.max(answer, sum);
            right++;
        }
        return answer;
    }

    public int step(int[][] fruits, int startPos, int left, int right) {
        return (
                Math.min(
                        Math.abs(startPos - fruits[right][0]),
                        Math.abs(startPos - fruits[left][0])
                ) + fruits[right][0] - fruits[left][0]
        );
    }
}
