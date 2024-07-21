package dev.hmmr.challenge.blind75.dynamicprogramming;

import java.util.Arrays;

public class CoinChange {
  public int coinChange(int[] coins, int amount) {
    int[] amounts = new int[amount + 1];
    Arrays.fill(amounts, Integer.MAX_VALUE);
    // if amount is 0 then 0 should be returned
    amounts[0] = 0;

    for (int coin : coins) {
      for (int i = coin; i <= amount; i++) {
        // will be true in the first iteration as amounts[0] == 0
        if (amounts[i - coin] != Integer.MAX_VALUE) {
          // either stay with amounts[i] value or reduce it if amounts[i - coin] +1 is less
          // +1 needs to be added as we get the amount without the value of coin
          amounts[i] = Math.min(amounts[i], amounts[i - coin] + 1);
        }
      }
    }

    // if amount could not be calculated and therefore still has Integer.MAX_VALUE set,
    // -1 should be returned
    return amounts[amount] == Integer.MAX_VALUE ? -1 : amounts[amount];
  }
}
