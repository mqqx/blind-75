package dev.hmmr.challenge.blind75.binary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0190Test {

  private LC0190 LC0190UnderTest;

  @BeforeEach
  void setUp() {
    LC0190UnderTest = new LC0190();
  }

  @MethodSource
  @ParameterizedTest
  void testReverseBits(int input, int expected) {
    assertThat(LC0190UnderTest.reverseBits(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testReverseBits() {
    return Stream.of(
        Arguments.arguments(43261596, 964176192), Arguments.arguments(-3, -1073741825));
  }
}
