package problems;

import java.util.ArrayList;
import java.util.List;

public class TwentyFourGameSolution {
    static final double EPSILON = 1e-4;
    static final double TARGET = 24.0;

    private boolean dfs(List<Double> list){
        int n = list.size();
        if(n == 1){
            return Math.abs(list.get(0) - TARGET) < EPSILON;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double x = list.get(i);
                double y = list.get(j);
                List<Double> rest = new ArrayList<>(n-1);
                for (int k = 0; k < n; k++) {
                    if(k != i && k != j){
                        rest.add(list.get(k));
                    }
                }
                double[] candidates = new double[]{
                        x + y,
                        x * y,
                        x - y,
                        y - x
                };
                for(double variable: candidates){
                    rest.add(variable);
                    if(dfs(rest)){
                        return true;
                    }
                    rest.remove(rest.size()-1);
                }
                if(Math.abs(y) > EPSILON){
                    rest.add(x / y);
                    if(dfs(rest)){
                        return true;
                    }
                    rest.remove(rest.size()-1);
                }
                if(Math.abs(x) > EPSILON){
                    rest.add(y / x);
                    if(dfs(rest)){
                        return true;
                    }
                    rest.remove(rest.size()-1);
                }
            }
        }
        return false;
    }

    public boolean judgePoint24(int[] cards) {
        List<Double> list = new ArrayList<>();
        for (int card : cards) {
            list.add((double) card);
        }
        return dfs(list);
    }
}
