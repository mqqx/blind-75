package dev.hmmr.challenge.blind75.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    final List<List<Integer>> result = new ArrayList<>();
    final int len = nums.length;

    // sort to make it easier to skip duplicates
    Arrays.sort(nums);

    for (int i = 0; i < len; i++) {
      final int cur = nums[i];

      // skip duplicates
      if (i > 0 && cur == nums[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;

      // for each number of index i validate the sum from left and right indexes
      while (left < right) {
        int sum = cur + nums[left] + nums[right];

        if (sum > 0) {
          // decrease the right index to lower the sum
          right--;
        } else if (sum < 0) {
          // increase the left index to increase the sum
          left++;
        } else {
          result.add(Arrays.asList(cur, nums[left], nums[right]));
          left++;

          // skip duplicates
          while (nums[left] == nums[left - 1] && left < right) {
            left++;
          }
        }
      }
    }

    return result;
  }
}
