package dev.hmmr.challenge.blind75.graph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumberOfIslandsTest {

  private NumberOfIslands numberOfIslandsUnderTest;

  @BeforeEach
  void setUp() {
    numberOfIslandsUnderTest = new NumberOfIslands();
  }

  @MethodSource
  @ParameterizedTest
  void testNumIslands(char[][] grid, int expected) {
    assertThat(numberOfIslandsUnderTest.numIslands(grid)).isEqualTo(expected);
  }

  static Stream<Arguments> testNumIslands() {
    return Stream.of(
        arguments(
            new char[][] {
              {'1', '1', '1', '1', '0'},
              {'1', '1', '0', '1', '0'},
              {'1', '1', '0', '0', '0'},
              {'0', '0', '0', '0', '0'}
            },
            1),
        arguments(
            new char[][] {
              {'1', '1', '0', '0', '0'},
              {'1', '1', '0', '0', '0'},
              {'0', '0', '1', '0', '0'},
              {'0', '0', '0', '1', '1'}
            },
            3));
  }
}
