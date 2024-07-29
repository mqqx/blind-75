package dev.hmmr.challenge.blind75.dynamicprogramming;

public class LongestCommonSubsequence {
  public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp = new int[m + 1][n + 1];

    // check the LCS for each char of each string
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
          // if the chars match, 1 can be added to the length of the strings until this chars
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          // otherwise, the max excluding either current left or current right char can be added
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }

    return dp[m][n];
  }
}
