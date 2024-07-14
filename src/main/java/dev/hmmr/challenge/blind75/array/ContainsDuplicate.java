package dev.hmmr.challenge.blind75.array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
  // beats 89% in runtime
  // beats  6% in memory
  public boolean containsDuplicateHash(int[] nums) {
    final HashSet<Integer> numbers = new HashSet<>();

    for (int num : nums) {
      if (numbers.contains(num)) {
        return true;
      }
      numbers.add(num);
    }
    return false;
  }

  // beats  5% in runtime
  // beats 42% in memory
  public boolean containsDuplicateStream(int[] nums) {
    return nums.length > Arrays.stream(nums).distinct().count();
  }
}
