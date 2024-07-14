package dev.hmmr.challenge.blind75.array;

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int profit = 0;
    // cheapest buy can be set to first price as array has length >= 1
    int cheapestBuy = prices[0];

    // loop can be started with second price as first price is already set
    for (int i = 1; i < prices.length; i++) {
      final int price = prices[i];
      // cheaper price to buy found
      if (price < cheapestBuy) {
        cheapestBuy = price;
      } else {
        // check if current price gives a higher profit
        profit = Math.max(profit, price - cheapestBuy);
      }
    }
    return profit;
  }
}
