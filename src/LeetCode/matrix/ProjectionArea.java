package LeetCode.matrix;

public class ProjectionArea {

    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xyArea = 0;
        int yzArea = 0;
        int zxArea = 0;
        int totalArea = 0;

        for (int i = 0; i < n; i++) {
            int maxRow = 0;
            int maxCol = 0;
            for (int j = 0; j < n; j++) {

                if (grid[i][j] != 0) {
                    xyArea++;
                }

                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }

            yzArea += maxCol;

            zxArea += maxRow;
        }

        totalArea += xyArea + yzArea + zxArea;

        return totalArea;
    }
}
