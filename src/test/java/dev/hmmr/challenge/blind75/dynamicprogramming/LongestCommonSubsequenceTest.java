package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestCommonSubsequenceTest {

  private LongestCommonSubsequence longestCommonSubsequenceUnderTest;

  @BeforeEach
  void setUp() {
    longestCommonSubsequenceUnderTest = new LongestCommonSubsequence();
  }

  @MethodSource
  @ParameterizedTest
  void testLongestCommonSubsequence(String input1, String input2, int expected) {
    assertThat(longestCommonSubsequenceUnderTest.longestCommonSubsequence(input1, input2))
        .isEqualTo(expected);
  }

  static Stream<Arguments> testLongestCommonSubsequence() {
    return Stream.of(
        Arguments.arguments("abcde", "ace", 3),
        Arguments.arguments("abc", "abc", 3),
        Arguments.arguments("abc", "def", 0));
  }
}
