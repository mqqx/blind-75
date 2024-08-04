package dev.hmmr.challenge.blind75.binary;

public class LC0371 {
  public int getSum(int a, int b) {
    // 1. use bitwise XOR to calculate the sum without carry
    // 2. use bitwise AND followed by a left shift to calculate the carry
    // 3. repeat until the carry becomes zero
    return b == 0 ? a : getSum(a^b, (a&b) <<1);
  }
}
