package problems;

public class MaximumAreaOfLongestDiagonalRectangleSolution {
    private double getDiagonal(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int areaOfMaxDiagonal(int[][] dimensions) {
        double longestDiagonal = 0;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int a = dimensions[i][0], b = dimensions[i][1];
            double diagonal = getDiagonal(a, b);
            if(diagonal > longestDiagonal){
                longestDiagonal = diagonal;
                maxArea = a * b;
            } else if(diagonal == longestDiagonal){
                maxArea = Math.max(maxArea, a * b);
            }
        }

        return maxArea;
    }
}
