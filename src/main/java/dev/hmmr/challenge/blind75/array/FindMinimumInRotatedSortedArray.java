package dev.hmmr.challenge.blind75.array;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {

  public int findMinStream(int[] nums) {
    if (nums == null || nums.length == 0) {
      return Integer.MIN_VALUE;
    }
    return Arrays.stream(nums).min().getAsInt();
  }

  public int findMinBinarySearch(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      // index between left and right
      final int mid = (left + right) / 2;

      // if the number on the middle index is smaller than the one on the right index
      // the smallest element has to be in on the left part of the array
      // therefore the new right index is the old middle index
      if (nums[mid] < nums[right]) {
        right = mid;
        // otherwise the smallest element is on the right part
        // therefore the new left index is the new middle index +1
      } else {
        left = mid + 1;
      }
    }

    return nums[left];
  }
}
