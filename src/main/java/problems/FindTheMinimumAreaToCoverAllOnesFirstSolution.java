package problems;

public class FindTheMinimumAreaToCoverAllOnesFirstSolution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length, columns = grid[0].length;

        int top = rows, left = columns, bottom = -1, right = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }

        return (bottom - top + 1) * (right - left + 1);
    }
}
