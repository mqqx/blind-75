package dev.hmmr.challenge.blind75.graph;

public class LC0200 {
  private static final char LAND = '1';
  private static final char NO_LAND = '0';

  public int numIslands(char[][] grid) {
    int numIslands = 0;
    int rows = grid.length;
    int cols = grid[0].length;

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (grid[row][col] == LAND) {
          // when we find a land cell, increment island count and explore the island
          numIslands++;
          dfs(grid, row, col);
        }
      }
    }

    return numIslands;
  }

  private void dfs(char[][] grid, int row, int col) {
    int rows = grid.length;
    int cols = grid[0].length;

    if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == NO_LAND) {
      return;
    }

    // mark as no land to ensure adjacent cells will only be counted to one island
    grid[row][col] = NO_LAND;

    // recursively explore adjacent cells
    // up
    dfs(grid, row - 1, col);
    // down
    dfs(grid, row + 1, col);
    // left
    dfs(grid, row, col - 1);
    // right
    dfs(grid, row, col + 1);
  }
}
