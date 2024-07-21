package dev.hmmr.challenge.blind75.binary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountingBitsTest {

  private CountingBits countingBitsUnderTest;

  @BeforeEach
  void setUp() {
    countingBitsUnderTest = new CountingBits();
  }

  @MethodSource
  @ParameterizedTest
  void testCountBits(int input, int[] expected) {
    assertThat(countingBitsUnderTest.countBits(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testCountBits() {
    return Stream.of(
        // 2
        Arguments.arguments(2, new int[] {0, 1, 1}),
        // 5
        Arguments.arguments(4, new int[] {0, 1, 1, 2, 1}),
        // 13
        Arguments.arguments(8, new int[] {0, 1, 1, 2, 1, 2, 2, 3, 1}),
        // 33
        Arguments.arguments(16, new int[] {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1}),
        Arguments.arguments(
            32,
            new int[] {
              0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3,
              4, 4, 5, 1
            }));
  }
}
