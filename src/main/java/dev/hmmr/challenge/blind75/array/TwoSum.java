package dev.hmmr.challenge.blind75.array;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    // only need to loop until nums.length -1 in outer loop
    // as the last number gets checked by inner loop
    for (int i = 0; i < nums.length - 1; i++) {
      // start at j=i+1 to skip checking addition of same numbers
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[0];
  }
}
