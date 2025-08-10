package problems;

import java.util.Arrays;

public class ReorderedPowerOfTwoSolution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortedString(n);
        for(int i = 0; i < 31; i++){
            if (sortedString(1 << i).equals(target)) {
                return true;
            }
        }
        return false;
    }

    private String sortedString(int x){
        char[] array = String.valueOf(x).toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
