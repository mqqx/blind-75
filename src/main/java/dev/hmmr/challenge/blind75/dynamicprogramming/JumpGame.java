package dev.hmmr.challenge.blind75.dynamicprogramming;

public class JumpGame {
  public boolean canJump(int[] nums) {
    int n = nums.length;
    // cannot jump anywhere if first index is 0
    if (nums[0] == 0) {
      return n == 1;
    }

    int i = 1;
    int last = nums[0];

    while (i < n - 1) {
      int cur = Math.max(nums[i++], last - 1);

      if (cur == 0) {
        return false;
      }

      last = cur;
    }

    return true;
  }

  public boolean canJumpSimplified(int[] nums) {
    int pos = 0;
    final int n = nums.length;

    for (int i = 0; i < n && pos < n - 1; i++) {
      if (i > pos) {
        return false;
      }
      // the minimal position which can be reached must be index + current number,
      // as otherwise it would not be possible to be at that index
      pos = Math.max(pos, i + nums[i]);
    }

    return true;
  }
}
