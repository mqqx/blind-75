package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DecodeWaysTest {

  private DecodeWays decodeWaysUnderTest;

  @BeforeEach
  void setUp() {
    decodeWaysUnderTest = new DecodeWays();
  }

  @MethodSource
  @ParameterizedTest
  void testNumDecodings(String input, int expected) {
    assertThat(decodeWaysUnderTest.numDecodings(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testNumDecodings() {
    return Stream.of(
        Arguments.arguments("12", 2),
        Arguments.arguments("226", 3),
        Arguments.arguments("1002", 0),
        Arguments.arguments("1221", 5),
        Arguments.arguments("11106", 2),
        Arguments.arguments("06", 0)
    );
  }
}
