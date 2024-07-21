package dev.hmmr.challenge.blind75.dynamicprogramming;


public class ClimbingStairs {
  public int climbStairs(int n) {
    if (n < 4) {
      return n;
    }

    int pre = 1;
    int cur = 1;

    // the possibilities can be calculated using fibonacci
    for (int i = 2; i <= n; i++) {
      int temp = cur;
      cur += pre;
      pre = temp;
    }

    return cur;
  }
}
