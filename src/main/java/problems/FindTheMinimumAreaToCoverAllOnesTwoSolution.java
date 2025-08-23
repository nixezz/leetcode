package problems;

public class FindTheMinimumAreaToCoverAllOnesTwoSolution {
    public int minimumSum(int[][] grid) {
        int[][] rgrid = rorate(grid);
        return Math.min(solve(grid), solve(rgrid));
    }

    private int[][] rorate(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] ret = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret[m - j - 1][i] = grid[i][j];
            }
        }
        return ret;
    }

    private int solve(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int result = n * m;
        for (int i = 0; i + 1 < n; i++) {
            for (int j = 0; j + 1 < m; j++) {
                result = Math.min(result,
                        getMinSum(grid,0, i, 0, m - 1) +
                                getMinSum(grid, i + 1, n - 1, 0, j) +
                                getMinSum(grid, i + 1, n - 1, j + 1, m - 1)
                );
                result = Math.min(result,
                        getMinSum(grid, 0, i, 0, j) +
                                getMinSum(grid, 0, i, j + 1, m - 1) +
                                getMinSum(grid, i + 1, n - 1, 0, m - 1)
                );
            }
        }
        for (int i = 0; i + 2 < n; i++) {
            for (int j = i + 1; j + 1 < n; j++) {
                result = Math.min(result,
                        getMinSum(grid, 0, i, 0, m - 1) +
                                getMinSum(grid, i + 1, j, 0, m - 1) +
                                getMinSum(grid, j + 1, n - 1, 0, m - 1)
                );
            }
        }
        return result;
    }

    private int getMinSum(int[][] grid, int u, int d, int l, int r){
        int min_i = grid.length, max_i = 0;
        int min_j = grid[0].length, max_j = 0;
        for (int i = u; i <= d; i++) {
            for (int j = l; j <= r; j++) {
                if(grid[i][j] == 1){
                    min_i = Math.min(min_i, i);
                    min_j = Math.min(min_j, j);
                    max_i = Math.max(max_i, i);
                    max_j = Math.max(max_j, j);
                }
            }
        }
        return min_i <= max_i ? (max_i - min_i + 1) * (max_j - min_j + 1) : Integer.MAX_VALUE / 3;
    }
}
