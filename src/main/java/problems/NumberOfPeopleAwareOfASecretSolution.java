package problems;

public class NumberOfPeopleAwareOfASecretSolution {
    private static final long MOD = (long) (1E9 + 7);

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long share = 0;
        for (int day = 2; day <= n; day++) {
            if (day - delay > 0){
                share = (share + dp[day - delay] + MOD) % MOD;
            }
            if (day - forget > 0){
                share = (share - dp[day - forget] + MOD) % MOD;
            }
            dp[day] = share;
        }
        long know = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            know = (know + dp[i]) % MOD;
        }
        return (int) know;
    }
}
