package dev.hmmr.challenge.blind75.dynamicprogramming;

public class UniquePaths {
  public int uniquePaths(int m, int n) {
    int[][] grid = new int[m][n];

    // initialize the first row and first column with 1, as there is only one way to reach any cell
    for (int i = 0; i < m; i++) {
      grid[i][0] = 1;
    }
    for (int j = 0; j < n; j++) {
      grid[0][j] = 1;
    }

    // for each cell, the number of unique paths is the sum of paths from above and left
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        grid[i][j] = grid[i-1][j] + grid[i][j-1];
      }
    }

    // the total will be bottom right
    return grid[m-1][n-1];
  }
}
