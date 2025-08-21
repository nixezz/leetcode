package problems;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfIntegerSolution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; i--) {
            result.add(0, (i >= 0 ? num[i] + k : k) % 10);
            k = (i >= 0 ? num[i] + k : k) / 10;
        }
        return result;
    }
}
