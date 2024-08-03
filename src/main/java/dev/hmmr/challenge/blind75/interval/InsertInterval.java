package dev.hmmr.challenge.blind75.interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    final List<int[]> result = new ArrayList<>();

    for (int[] interval : intervals) {
      // if new interval is lower than interval, add new interval and set it to interval
      if (newInterval[1] < interval[0]) {
        result.add(newInterval);
        newInterval = interval;
      }
      // if interval is lower than new interval, add interval
      else if (interval[1] < newInterval[0]) {
        result.add(interval);
      }
      // if above conditions fail the intervals are overlapping
      // therefore update new interval with the combined intervals
      else {
        newInterval[0] = Math.min(newInterval[0], interval[0]);
        newInterval[1] = Math.max(newInterval[1], interval[1]);
      }
    }

    result.add(newInterval);
    return result.toArray(new int[result.size()][]);
  }
}
