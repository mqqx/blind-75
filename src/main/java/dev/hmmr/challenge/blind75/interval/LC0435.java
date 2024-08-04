package dev.hmmr.challenge.blind75.interval;

import java.util.Arrays;
import java.util.Comparator;

public class LC0435 {
  public int eraseOverlapIntervals(int[][] intervals) {
    // sort intervals based on end
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

    int count = 0;
    int lastEnd = intervals[0][1];

    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < lastEnd) {
        // cur interval overlaps with the last non-overlapping interval
        count++;
      } else {
        lastEnd = intervals[i][1];
      }
    }

    return count;
  }
}
