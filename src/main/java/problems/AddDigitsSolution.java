package problems;

import java.util.HashSet;

public class AddDigitsSolution {
    private static int getSumDigits(int x) {
        int total = 0;
        while (x > 0) {
            total += x % 10;
            x /= 10;
        }
        return total;
    }

    public static int addDigits(int num) {
        if(num < 10){
            return num;
        }
        HashSet<Integer> root = new HashSet<>();
        while (!root.contains(num)){
            root.add(num);
            num = getSumDigits(num);
        }
        return num;
    }
}
