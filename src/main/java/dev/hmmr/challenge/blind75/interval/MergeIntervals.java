package dev.hmmr.challenge.blind75.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
  public int[][] merge(int[][] intervals) {
    final List<int[]> mergedIntervals = new ArrayList<>();

    // as the array is unsorted we sort it first by comparing start of each interval
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    // used to store the last interval to combine overlapping intervals before they get inserted
    int[] last = null;

    for (int[] interval : intervals) {
      if (last == null) {
        last = interval;
      } else if (last[1] < interval[0]) {
        // only insert when the last interval ends before the current one starts
        mergedIntervals.add(last);
        last = interval;
      } else {
        // combine overlapping end, as start is already minimum because of initial sort
        last[1] = Math.max(last[1], interval[1]);
      }
    }

    mergedIntervals.add(last);
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }
}
