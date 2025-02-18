package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0053Test {

  private LC0053 LC0053UnderTest;

  @BeforeEach
  void setUp() {
    LC0053UnderTest = new LC0053();
  }

  @MethodSource
  @ParameterizedTest
  void testMaxSubArray(int[] input, int expected) {
    assertThat(LC0053UnderTest.maxSubArray(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testMaxSubArray() {
    return Stream.of(
        Arguments.arguments(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
        Arguments.arguments(new int[] {1}, 1),
        Arguments.arguments(new int[] {-2, 1}, 1),
        Arguments.arguments(new int[] {5, 4, -1, 7, 8}, 23));
  }
}
