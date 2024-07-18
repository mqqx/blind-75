package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ProductOfArrayExceptSelfTest {

  private ProductOfArrayExceptSelf productOfArrayExceptSelfUnderTest;

  @BeforeEach
  void setUp() {
    productOfArrayExceptSelfUnderTest = new ProductOfArrayExceptSelf();
  }

  @MethodSource
  @ParameterizedTest
  void testProductExceptSelf(int[] input, int[] expected) {
    assertThat(productOfArrayExceptSelfUnderTest.productExceptSelfFast(input)).isEqualTo(expected);
    assertThat(productOfArrayExceptSelfUnderTest.productExceptSelfEfficient(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testProductExceptSelf() {
    return Stream.of(
        Arguments.arguments(new int[] {1, 2, 3, 4}, new int[] {24, 12, 8, 6}),
        Arguments.arguments(new int[] {0, 2, 3, 4}, new int[] {24, 0, 0, 0}),
        Arguments.arguments(new int[] {1, 0}, new int[] {0, 1}),
        Arguments.arguments(new int[] {0, 0}, new int[] {0, 0}),
        Arguments.arguments(new int[] {9, 0, -2}, new int[] {0, -18, 0}),
        Arguments.arguments(new int[] {-1, 1, 0, -3, 3}, new int[] {0, 0, 9, 0, 0}),
        Arguments.arguments(new int[] {-5, 2, 2, 0, 0}, new int[] {0, 0, 0, 0, 0}),
        Arguments.arguments(new int[] {-5, 2, 2, 3, 4}, new int[] {48, -120, -120, -80, -60}));
  }
}
