package dev.hmmr.challenge.blind75.interval;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeIntervalsTest {

  private MergeIntervals mergeIntervalsUnderTest;

  @BeforeEach
  void setUp() {
    mergeIntervalsUnderTest = new MergeIntervals();
  }

  @MethodSource
  @ParameterizedTest
  void testMerge(int[][] intervals, int[][] expected) {
    assertThat(mergeIntervalsUnderTest.merge(intervals)).isEqualTo(expected);
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
