package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainerWithMostWaterTest {

  private ContainerWithMostWater containerWithMostWaterUnderTest;

  @BeforeEach
  void setUp() throws Exception {
    containerWithMostWaterUnderTest = new ContainerWithMostWater();
  }

  @MethodSource
  @ParameterizedTest
  void testMaxArea(int[] input, int expected) {
    assertThat(containerWithMostWaterUnderTest.maxArea(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testMaxArea() {
    return Stream.of(
        Arguments.arguments(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
        Arguments.arguments(new int[] {1, 1}, 1));
  }
}
