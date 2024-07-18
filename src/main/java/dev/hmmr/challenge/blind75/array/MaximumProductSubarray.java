package dev.hmmr.challenge.blind75.array;

public class MaximumProductSubarray {
  public int maxProduct(int[] nums) {
    int max = nums[0];
    int min = max;
    int product = max;
    int temp;

    for (int i = 1; i < nums.length; i++) {
      final int cur = nums[i];
      if (cur < 0) {
        temp = max;
        max = min;
        min = temp;
      }

      max = Math.max(cur, cur * max);
      min = Math.min(cur, cur * min);
      product = Math.max(product, max);
    }
    return product;
  }
}
