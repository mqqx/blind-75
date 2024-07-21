package dev.hmmr.challenge.blind75.binary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumberOf1BitsTest {

  private NumberOf1Bits numberOf1BitsUnderTest;

  @BeforeEach
  void setUp() {
    numberOf1BitsUnderTest = new NumberOf1Bits();
  }

  @MethodSource
  @ParameterizedTest
  void testHammingWeight(int input, int expected) {
    assertThat(numberOf1BitsUnderTest.hammingWeight(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testHammingWeight() {
    return Stream.of(
        Arguments.arguments(11, 3),
        Arguments.arguments(128, 1),
        Arguments.arguments(2147483645, 30));
  }
}
