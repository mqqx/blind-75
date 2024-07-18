package dev.hmmr.challenge.blind75.array;

public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    int max = nums[0];
    int sum = Math.max(max, 0);

    for (int i = 1; i < nums.length; i++) {
      sum += nums[i];
      max = Math.max(max, sum);

      // always reset negative sum to ensure proper start
      if (sum < 0) {
        sum = 0;
      }
    }

    return max;
  }
}
