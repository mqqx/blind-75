package dev.hmmr.challenge.blind75.binary;

public class MissingNumber {
  public int missingNumber(int[] nums) {
    final int numCount = nums.length;
    int totalSum = numCount * (numCount + 1) / 2;

    for (int num : nums) {
      totalSum -= num;
    }

    return totalSum;
  }
}
