package dev.hmmr.challenge.blind75.graph;

import java.util.Arrays;

public class LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    // sort array to make it easy to count longest consecutive sequence while iterating
    Arrays.sort(nums);

    int longestSeqCount = 0;
    int seqCount = 0;
    int last = Integer.MIN_VALUE;

    for (int cur : nums) {
      last++;

      // for a consecutive sequence last++ needs to be equal to cur
      if (cur == last) {
        seqCount++;
        // otherwise the sequence can be reset, as we have a sorted array
      } else if (cur > last) {
        seqCount = 1;
      }

      last = cur;
      longestSeqCount = Math.max(longestSeqCount, seqCount);
    }

    return longestSeqCount;
  }
}
