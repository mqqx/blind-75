package dev.hmmr.challenge.blind75.graph;

import java.util.Arrays;

public class LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);

    int longestSeqCount = 0;
    int seqCount = 0;
    int last = Integer.MIN_VALUE;
    for (int cur : nums) {
      last++;

      if (cur == last) {
        seqCount++;
      } else if (cur > last) {
        seqCount = 1;
      }

      longestSeqCount = Math.max(longestSeqCount, seqCount);
      last = cur;
    }

    return longestSeqCount;
  }
}
