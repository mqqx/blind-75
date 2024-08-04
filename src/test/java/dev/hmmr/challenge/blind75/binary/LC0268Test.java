package dev.hmmr.challenge.blind75.binary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0268Test {

  private LC0268 LC0268UnderTest;

  @BeforeEach
  void setUp() {
    LC0268UnderTest = new LC0268();
  }

  @MethodSource
  @ParameterizedTest
  void testMissingNumber(int[] input, int expected) {
    assertThat(LC0268UnderTest.missingNumber(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testMissingNumber() {
    return Stream.of(
        Arguments.arguments(new int[] {3,0,1}, 2),
        Arguments.arguments(new int[] {0,1}, 2),
        Arguments.arguments(new int[] {9,6,4,2,3,5,7,0,1}, 8)
    );
  }
}
