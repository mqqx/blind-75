package dev.hmmr.challenge.blind75.dynamicprogramming;

import java.util.Arrays;

public class LC0300 {

  public int lengthOfLISOn2(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];
    int maxLength = 1;

    // initialize all LIS values to 1, as each element is a subsequence of at least 1
    Arrays.fill(dp, 1);

    // start with index 1 and check against all previous elements
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        // if the current element is greater than a previous one,
        // the LIS can be potentially increased
        if (nums[i] > nums[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
      // maxLength will be updated while we check each element
      maxLength = Math.max(maxLength, dp[i]);
    }

    return maxLength;
  }

  public int lengthOfLISOnLogN(int[] nums) {
    // used to store the smallest tail of all increasing subsequences of each length
    int[] tails = new int[nums.length];
    int maxLength = 0;


    for (int num : nums) {
      // find the correct position for the current number in the tails array
      // returns -(insertion point) -1 when the number is not found
      int i = Arrays.binarySearch(tails, 0, maxLength, num);

      // if the number was not found
      if (i < 0) {
        // we can calculate the insertion point
        // by adding +1 to i and negating it
        i = -(i + 1);
      }

      tails[i] = num;
      if (i == maxLength) {
        maxLength++;
      }
    }

    return maxLength;
  }
}
