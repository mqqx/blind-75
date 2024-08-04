package dev.hmmr.challenge.blind75.binary;


public class LC0338 {
  public int[] countBits(int n) {
    int[] result = new int[n + 1];

    for (int i = 0; i <= n; i++) {
      result[i] = Integer.bitCount(i);
    }

    return result;
  }
}
