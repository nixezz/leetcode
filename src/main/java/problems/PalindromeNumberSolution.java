package problems;

public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int[] a = new int[32];
        int i = 0;
        while (x != 0) {
            a[i++] = x % 10;
            x /= 10;
        }
        int p1 = 0, p2 = i - 1;
        while (p1 <= p2) {
            if(a[p1++] != a[p2--]) {
                return false;
            }
        }
        return true;
    }
}
