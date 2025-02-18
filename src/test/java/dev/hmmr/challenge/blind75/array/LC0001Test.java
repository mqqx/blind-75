package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0001Test {

  private LC0001 LC0001UnderTest;

  @BeforeEach
  void setUp() {
    LC0001UnderTest = new LC0001();
  }

  @MethodSource
  @ParameterizedTest
  void testTwoSum(int[] input, int sum, int[] expected) {
    assertThat(LC0001UnderTest.twoSum(input, sum)).isEqualTo(expected);
  }

  private static Stream<Arguments> testTwoSum() {
    return Stream.of(
        Arguments.arguments(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
        Arguments.arguments(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
        Arguments.arguments(new int[] {3, 3}, 6, new int[] {0, 1}));
  }
}
