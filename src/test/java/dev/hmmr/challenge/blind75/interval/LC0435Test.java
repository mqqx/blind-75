package dev.hmmr.challenge.blind75.interval;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0435Test {

  private LC0435 lc0435UnderTest;

  @BeforeEach
  void setUp() {
    lc0435UnderTest = new LC0435();
  }

  @MethodSource
  @ParameterizedTest
  void testEraseOverlapIntervals(int[][] intervals, int expected) {
    assertThat(lc0435UnderTest.eraseOverlapIntervals(intervals)).isEqualTo(expected);
  }

  static Stream<Arguments> testEraseOverlapIntervals() {
    return Stream.of(
        arguments(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}, 1),
        arguments(new int[][] {{1, 2}, {1, 2}, {1, 2}}, 2),
        arguments(new int[][] {{1, 2}, {2, 3}}, 0));
  }
}
