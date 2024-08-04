package dev.hmmr.challenge.blind75.dynamicprogramming;

public class LC0213 {
  public int rob(int[] nums) {
    final int n = nums.length;

    if (n == 1) {
      return nums[0];
    }
    if (n == 2) {
      return Math.max(nums[0], nums[1]);
    }

    // rob range from 0 to n-1
    int max1 = robRange(nums, 0, n - 1);
    // rob range from 1 to n
    int max2 = robRange(nums, 1, n);

    // return whichever is higher
    return Math.max(max1, max2);
  }

  private static int robRange(int[] nums, int start, int end) {
    int twoBack = 0;
    int oneBack = 0;
    int current = 0;

    for (int i = start; i < end; i++) {
      int temp = current;

      current = Math.max(Math.max(current, nums[i] + oneBack), nums[i] + twoBack);
      twoBack = oneBack;
      oneBack = temp;
    }

    return current;
  }
}
