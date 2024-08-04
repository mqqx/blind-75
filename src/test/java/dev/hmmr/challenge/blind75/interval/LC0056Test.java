package dev.hmmr.challenge.blind75.interval;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0056Test {

  private LC0056 LC0056UnderTest;

  @BeforeEach
  void setUp() {
    LC0056UnderTest = new LC0056();
  }

  @MethodSource
  @ParameterizedTest
  void testMerge(int[][] intervals, int[][] expected) {
    assertThat(LC0056UnderTest.merge(intervals)).isEqualTo(expected);
  }

  static Stream<Arguments> testMerge() {
    return Stream.of(
        arguments(
            new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}},
            new int[][] {{1, 6}, {8, 10}, {15, 18}}),
        arguments(new int[][] {{1, 4}, {4, 5}}, new int[][] {{1, 5}}),
        arguments(new int[][] {{1, 4}, {0, 0}}, new int[][] {{0, 0}, {1, 4}}));
  }
}
