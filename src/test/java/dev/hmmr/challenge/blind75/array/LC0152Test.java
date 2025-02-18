package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0152Test {

  private LC0152 LC0152UnderTest;

  @BeforeEach
  void setUp() {
    LC0152UnderTest = new LC0152();
  }

  @MethodSource
  @ParameterizedTest
  void testMaxProduct(int[] input, int expected) {
    assertThat(LC0152UnderTest.maxProduct(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testMaxProduct() {
    return Stream.of(
        Arguments.arguments(new int[] {2,3,-2,4}, 6),
        Arguments.arguments(new int[] {1}, 1),
        Arguments.arguments(new int[] {-2, 2}, 2),
        Arguments.arguments(new int[] {3,-1,4}, 4),
        Arguments.arguments(new int[] {-3,-1,-1}, 3),
        Arguments.arguments(new int[] {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0}, 1000000000),
        Arguments.arguments(new int[] {-2,0,-1}, 0));
  }
}
