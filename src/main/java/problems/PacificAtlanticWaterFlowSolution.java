package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlowSolution {
    private int m, n;
    private int[][] directions = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
    };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n = heights[0].length;
        m = heights.length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for (int i = 0; i < n; i++) {
            dfs(0, i, heights, pacific);
        }
        for (int i = 0; i < m; i++) {
            dfs(i, 0, heights, pacific);
        }
        for (int i = 0; i < n; i++) {
            dfs(m - 1, i, heights, atlantic);
        }
        for (int i = 0; i < m; i++) {
            dfs(i, n - 1, heights, atlantic);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int x, int y, int[][] heights, boolean[][] visited) {
        if (visited[x][y]) return;
        visited[x][y] = true;
        for (int[] direction : directions) {
            int newX = x + direction[0], newY = y + direction[1];
            if (newX < 0 || newX >= m || newY < 0 || newY >= n) continue;
            if (heights[newX][newY] < heights[x][y]) continue;
            dfs(newX, newY, heights, visited);
        }
    }
}
