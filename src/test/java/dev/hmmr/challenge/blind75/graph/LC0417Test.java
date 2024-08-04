package dev.hmmr.challenge.blind75.graph;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0417Test {

  private LC0417 LC0417UnderTest;

  @BeforeEach
  void setUp() {
    LC0417UnderTest = new LC0417();
  }

  @MethodSource
  @ParameterizedTest
  void testPacificAtlantic(int[][] heights, List<List<Integer>> expected) {
    assertThat(LC0417UnderTest.pacificAtlantic(heights)).isEqualTo(expected);
  }

  static Stream<Arguments> testPacificAtlantic() {
    return Stream.of(
        Arguments.arguments(
            new int[][] {
              {1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}
            },
            List.of(
                List.of(0, 4),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 2),
                List.of(3, 0),
                List.of(3, 1),
                List.of(4, 0))),
        Arguments.arguments(new int[][] {{1}}, List.of(List.of(0, 0))));
  }
}
