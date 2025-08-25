package problems;

public class DiagonalTraverseSolution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, column = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][column];

            if((row + column) % 2 == 0) {
                if(column == n - 1){
                    row++;
                } else if(row == 0){
                    column++;
                } else {
                    row--;
                    column++;
                }
            } else {
                if(row == m - 1){
                    column++;
                } else if(column == 0){
                    row++;
                } else {
                    row++;
                    column--;
                }
            }
        }

        return result;
    }
}
