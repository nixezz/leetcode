package problems;

public class PrimePalindromeSolution {
    private int reverse(int number) {
        int answer = 0;
        while (number != 0) {
            answer = answer * 10 + number % 10;
            number /= 10;
        }
        return answer;
    }

    private boolean isPrime(int number){
        if (number < 2) return false;
        int R = (int) Math.sqrt(number);
        for (int i = 2; i <= R; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public int primePalindrome(int n) {
        while (true){
            if ((n == reverse(n)) && (isPrime(n))) {
                return n;
            }
            n++;
            if ((9_999_999 < n) && n < (100_000_001)){
                n = 100_000_001;
            }
        }
    }
}
