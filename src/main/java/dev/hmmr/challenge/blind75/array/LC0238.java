package dev.hmmr.challenge.blind75.array;

import java.util.Arrays;

public class LC0238 {
  // beats 86% in runtime
  // beats  5% in memory
  public int[] productExceptSelfFast(int[] nums) {
    final int firstNum = nums[0];
    final int secondNum = nums[1];
    int product = 1;
    boolean containsZero = firstNum == 0;
    int zeroIndex = firstNum == 0 ? 0 : -1;

    if (nums.length == 2) {
      if (firstNum == 0 && secondNum == 0) {
        return new int[] {0, 0};
      } else if (firstNum == 0 || secondNum == 0) {
        return new int[] {secondNum, firstNum};
      }
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == 0 && !containsZero) {
        containsZero = true;
        zeroIndex = i;
        continue;
      }

      product *= nums[i];
    }

    if (containsZero) {
      for (int i = 0; i < nums.length; i++) {
        if (i == 0 && zeroIndex == 0) {
          nums[i] = product;
        } else if (i == zeroIndex) {
          nums[i] = product * firstNum;
        } else {
          nums[i] = 0;
        }
      }
    } else {
      nums[0] = product;
      for (int i = 1; i < nums.length; i++) {
        nums[i] = product / nums[i] * firstNum;
      }
    }
    return nums;
  }

  // beats 23% in runtime
  // beats 90% in memory
  public int[] productExceptSelfEfficient(int[] nums) {
    int prefixAndSuffixProduct[] = new int[nums.length];
    Arrays.fill(prefixAndSuffixProduct, 1);
    int curr = 1;
    for (int i = 0; i < nums.length; i++) {
      prefixAndSuffixProduct[i] *= curr;
      curr *= nums[i];
    }
    curr = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      prefixAndSuffixProduct[i] *= curr;
      curr *= nums[i];
    }
    return prefixAndSuffixProduct;
  }
}
