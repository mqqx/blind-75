package dev.hmmr.challenge.blind75.dynamicprogramming;

public class LC0377 {
  public int combinationSum4(int[] nums, int target) {
    int[] dp = new int[target + 1];

    // there's one way to make a sum of 0, which is by using no numbers
    dp[0] = 1;

    // iterate through all sums from 1 to target
    for (int curTarget = 1; curTarget <= target; curTarget++) {
      for (int num : nums) {
        // if the current number can be used to form the current sum
        if (curTarget - num >= 0) {
          // add the number of combinations that form (curTarget - num)
          // to the number of combinations for curTarget
          dp[curTarget] += dp[curTarget - num];
        }
      }
    }

    return dp[target];
  }
}
