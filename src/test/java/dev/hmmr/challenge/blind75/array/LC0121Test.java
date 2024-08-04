package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0121Test {

  private LC0121 LC0121UnderTest;

  @BeforeEach
  void setUp() {
    LC0121UnderTest = new LC0121();
  }

  @MethodSource
  @ParameterizedTest
  void testMaxProfit(int[] input, int expected) {
    assertThat(LC0121UnderTest.maxProfit(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testMaxProfit() {
    return Stream.of(
        Arguments.arguments(new int[] {7, 1, 5, 3, 6, 4}, 5),
        Arguments.arguments(new int[] {7, 6, 4, 3, 1}, 0));
  }
}
