package dev.hmmr.challenge.blind75.dynamicprogramming;

import java.util.List;

public class WordBreak {
  public boolean wordBreak(String s, List<String> wordDict) {
    final int n = s.length();

    // dp[i] will be true if s[0..i-1] can be segmented into words in the wordDict.
    final boolean[] dp = new boolean[n + 1];

    // use maxWordLen to reduce unnecessary calls in the inner loop
    final int maxWordLen = wordDict.stream().mapToInt(String::length).max().orElse(0);
    dp[0] = true;

    for (int i = 1; i <= n; i++) {
      // check all possible substrings ending at i
      // start j from i-1 down to the maximum possible start index of the substring,
      // ensuring j is non-negative
      for (int j = i - 1; j >= Math.max(i - maxWordLen - 1, 0); j--) {
        // if dp[j] is true and the substring from j to i is in the wordDict,
        // it means s[0..i-1] can be segmented
        if (dp[j] && wordDict.contains(s.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }

    return dp[n];
  }
}
