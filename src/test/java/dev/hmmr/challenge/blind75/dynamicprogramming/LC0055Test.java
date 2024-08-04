package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0055Test {

  private LC0055 LC0055UnderTest;

  @BeforeEach
  void setUp() throws Exception {
    LC0055UnderTest = new LC0055();
  }

  @MethodSource
  @ParameterizedTest
  void testCanJump(int[] input, boolean expected) {
    assertThat(LC0055UnderTest.canJump(input)).isEqualTo(expected);
    assertThat(LC0055UnderTest.canJumpSimplified(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testCanJump() {
    return Stream.of(
        Arguments.arguments(new int[] {2, 3, 1, 1, 4}, true),
        Arguments.arguments(new int[] {0}, true),
        Arguments.arguments(new int[] {3, 2, 1, 0, 4}, false));
  }
}
