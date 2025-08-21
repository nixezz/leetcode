package problems;

import java.util.Stack;

public class CountSubmatricesWithAllOnesSolution {
    public int numSubmat(int[][] mat) {
        if(mat == null || mat.length == 0 || mat[0].length == 0) return 0;

        int allOnes = 0;
        int n = mat[0].length;
        int[] heights = new int[n];

        for(int[] row : mat){
            for (int i = 0; i < n; i++) {
                heights[i] = row[i] == 0 ? 0 : heights[i] + 1;
            }
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[] {-1, 0, -1});
            for (int i = 0; i < n; i++) {
                int h = heights[i];
                while(stack.peek()[2] >= h){
                    stack.pop();
                }
                int[] top = stack.peek();
                int j = top[0];
                int previous = top[1];
                int current = previous + (i - j) * h;
                stack.push(new int[] {i, current, h});
                allOnes += current;
            }
        }

        return allOnes;
    }
}
