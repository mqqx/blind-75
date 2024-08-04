package dev.hmmr.challenge.blind75.dynamicprogramming;

public class LC0091 {
  public int numDecodings(String s) {
    // handle leading 0 case, by returning 0 as decoding is not possible
    if (s.charAt(0) == '0') {
      return 0;
    }

    final int n = s.length();
    final int[] dp = new int[n + 1];
    // empty string could be decoded to 0
    dp[0] = 1;
    // non-zero digit can be decoded
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      // convert previous char to integer by subtracting '0' from it
      int oneDigit = s.charAt(i - 1) - '0';
      // parse integer from previous two chars
      int twoDigits = Integer.parseInt(s.substring(i - 2, i));

      // if previous digit is not 0, we can add the possibilities of the previous char
      if (oneDigit != 0) {
        dp[i] += dp[i - 1];
      }

      // if the previous two digits are between 10 and 26 the possibilities of the pre-previous char
      // can be added
      if (10 <= twoDigits && twoDigits <= 26) {
        dp[i] += dp[i - 2];
      }
    }

    return dp[n];
  }
}
