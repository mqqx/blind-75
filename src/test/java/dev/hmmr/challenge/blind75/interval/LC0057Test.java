package dev.hmmr.challenge.blind75.interval;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0057Test {

  private LC0057 LC0057UnderTest;

  @BeforeEach
  void setUp() {
    LC0057UnderTest = new LC0057();
  }

  @MethodSource
  @ParameterizedTest
  void testInsert(int[][] intervals, int[] newInterval, int[][] expected) {
    // Run the test
    final int[][] result = LC0057UnderTest.insert(intervals, newInterval);

    // Verify the results
    assertThat(result).isEqualTo(expected);
  }

  static Stream<Arguments> testInsert() {
    return Stream.of(
        arguments(new int[][] {{1, 3}, {6, 9}}, new int[] {2, 5}, new int[][] {{1, 5}, {6, 9}}),
        arguments(new int[][] {{2, 6}, {7, 9}}, new int[] {15, 18}, new int[][] {{2, 6}, {7, 9}, {15, 18}}),
        arguments(new int[][] {}, new int[] {5, 7}, new int[][] {{5, 7}}),
        arguments(new int[][] {{1, 5}}, new int[] {2, 3}, new int[][] {{1, 5}}),
        arguments(new int[][] {{1, 5}}, new int[] {6, 8}, new int[][] {{1, 5}, {6, 8}}),
        arguments(
            new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
            new int[] {4, 8},
            new int[][] {{1, 2}, {3, 10}, {12, 16}}));
  }
}
