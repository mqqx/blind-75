package dev.hmmr.challenge.blind75.dynamicprogramming;

public class LC0198 {
  public int rob(int[] nums) {
    final int n = nums.length;

    if (n == 1) {
      return nums[0];
    }

    // represents the max which can be robbed from i-2 houses
    // initialized with 0 as there is no house before the first one
    int twoBack = 0;
    // represents the max which can be robbed from i-1 houses
    // initialized with the value of the first house
    int oneBack = nums[0];
    // represents the max of the current position i and the earlier position i-1
    int current = Math.max(oneBack, nums[1]);

    for (int i = 2; i < n; i++) {
      int temp = current;
      // update current to be the maximum of:
      // 1. current (not robbing the current house)
      // 2. nums[i] + oneBack (robbing the current house and the house two positions back)
      // 3. nums[i] + twoBack (robbing the current house and the house three positions back)
      current = Math.max(Math.max(current, nums[i] + oneBack), nums[i] + twoBack);
      twoBack = oneBack;
      oneBack = temp;
    }

    return current;
  }
}
