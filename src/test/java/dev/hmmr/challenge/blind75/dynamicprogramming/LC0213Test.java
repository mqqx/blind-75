package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0213Test {

  private LC0213 LC0213UnderTest;

  @BeforeEach
  void setUp() {
    LC0213UnderTest = new LC0213();
  }

  @MethodSource
  @ParameterizedTest
  void testRob(int[] nums, int expected) {
    assertThat(LC0213UnderTest.rob(nums)).isEqualTo(expected);
  }

  static Stream<Arguments> testRob() {
    return Stream.of(
        Arguments.arguments(new int[] {2, 3, 2}, 3),
        Arguments.arguments(new int[] {0}, 0),
        Arguments.arguments(new int[] {0, 0}, 0),
        Arguments.arguments(new int[] {4, 8, 8, 8, 4}, 16),
        Arguments.arguments(new int[] {8, 2, 2, 8}, 10),
        Arguments.arguments(new int[] {8, 2, 2, 2, 8}, 10),
        Arguments.arguments(new int[] {8, 2, 2, 2, 2, 8}, 12),
        Arguments.arguments(new int[] {1, 2, 3, 1}, 4),
        Arguments.arguments(new int[] {1, 2, 3}, 3));
  }
}
