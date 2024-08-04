package dev.hmmr.challenge.blind75.array;

public class LC0011 {
  public int maxArea(int[] height) {
    int right = height.length - 1;
    int left = 0;
    int max = 0;

    while (left < right) {
      // use two pointers and calculate area while moving the pointer of the lower line
      final int curMax = Math.min(height[left], height[right]) * (right - left);
      max = Math.max(max, curMax);

      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }

    return max;
  }
}
