package dev.hmmr.challenge.blind75.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int rows = heights.length;
    int cols = heights[0].length;

    boolean[][] pacificReached = new boolean[rows][cols];
    boolean[][] atlanticReached = new boolean[rows][cols];

    // perform DFS through all columns
    for (int col = 0; col < cols; col++) {
      dfs(0, col, rows, cols, pacificReached, heights[0][col], heights);
      dfs(rows - 1, col, rows, cols, atlanticReached, heights[rows - 1][col], heights);
    }

    // perform DFS through all rows
    for (int row = 0; row < rows; row++) {
      dfs(row, 0, rows, cols, pacificReached, heights[row][0], heights);
      dfs(row, cols - 1, rows, cols, atlanticReached, heights[row][cols - 1], heights);
    }

    final List<List<Integer>> result = new ArrayList<>();
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (pacificReached[row][col] && atlanticReached[row][col]) {
          result.add(Arrays.asList(row, col));
        }
      }
    }
    return result;
  }

  private void dfs(
      int row, int col, int rows, int cols, boolean[][] visited, int prevHeight, int[][] heights) {
    if (row < 0
        || row >= rows
        || col < 0
        || col >= cols
        || visited[row][col]
        || prevHeight > heights[row][col]) {
      return;
    }
    visited[row][col] = true;

    // recursively explore adjacent cells (up, down, left, right)
    dfs(row + 1, col, rows, cols, visited, heights[row][col], heights);
    dfs(row - 1, col, rows, cols, visited, heights[row][col], heights);
    dfs(row, col + 1, rows, cols, visited, heights[row][col], heights);
    dfs(row, col - 1, rows, cols, visited, heights[row][col], heights);
  }
}
