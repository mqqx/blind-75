package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0300Test {

  private LC0300 LC0300UnderTest;

  @BeforeEach
  void setUp() {
    LC0300UnderTest = new LC0300();
  }

  @MethodSource
  @ParameterizedTest
  void testLengthOfLISOn(int[] input, int expected) {
    assertThat(LC0300UnderTest.lengthOfLISOn2(input)).isEqualTo(expected);
    assertThat(LC0300UnderTest.lengthOfLISOnLogN(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testLengthOfLISOn() {
    return Stream.of(
        Arguments.arguments(new int[] {10, 9, 2, 5, 3, 7, 101, 18}, 4),
        Arguments.arguments(new int[] {10, 9, 2, 5, 6, 8, 9, 7}, 5),
        Arguments.arguments(new int[] {0, 1, 0, 3, 2, 3}, 4),
        Arguments.arguments(new int[] {7, 7, 7, 7, 7, 7, 7}, 1));
  }
}
