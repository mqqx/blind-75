package dev.hmmr.challenge.blind75.binary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseBitsTest {

  private ReverseBits reverseBitsUnderTest;

  @BeforeEach
  void setUp() {
    reverseBitsUnderTest = new ReverseBits();
  }

  @MethodSource
  @ParameterizedTest
  void testReverseBits(int input, int expected) {
    assertThat(reverseBitsUnderTest.reverseBits(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testReverseBits() {
    return Stream.of(
        Arguments.arguments(43261596, 964176192), Arguments.arguments(-3, -1073741825));
  }
}
