package problems;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersSolution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1, b = 0;
        for (; a < n; a++) {
            b = n - a;
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")) {
                break;
            }
        }
        return new int[]{a, b};
    }
}
