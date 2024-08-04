package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC1143Test {

  private LC1143 LC1143UnderTest;

  @BeforeEach
  void setUp() {
    LC1143UnderTest = new LC1143();
  }

  @MethodSource
  @ParameterizedTest
  void testLongestCommonSubsequence(String input1, String input2, int expected) {
    assertThat(LC1143UnderTest.longestCommonSubsequence(input1, input2))
        .isEqualTo(expected);
  }

  static Stream<Arguments> testLongestCommonSubsequence() {
    return Stream.of(
        Arguments.arguments("abcde", "ace", 3),
        Arguments.arguments("abc", "abc", 3),
        Arguments.arguments("abc", "def", 0));
  }
}
