package dev.hmmr.challenge.blind75.array;

public class SearchInRotatedSortedArray {
  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      // index between left and right
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      if (nums[left] <= nums[mid]) {
        // left side is sorted

        if (nums[left] <= target && target < nums[mid]) {
          // target has to be in the left half
          right = mid - 1;
        } else {
          // target has to be in the right half
          left = mid + 1;
        }
      } else {
        // right side is sorted

        if (nums[mid] < target && target <= nums[right]) {
          // target has to be in the right half
          left = mid + 1;
        } else {
          // target has to be in the left half
          right = mid - 1;
        }
      }
    }

    return -1;
  }
}
