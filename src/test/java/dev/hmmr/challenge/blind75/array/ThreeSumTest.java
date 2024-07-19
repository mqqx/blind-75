package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThreeSumTest {

  private ThreeSum threeSumUnderTest;

  @BeforeEach
  void setUp() {
    threeSumUnderTest = new ThreeSum();
  }

  @MethodSource
  @ParameterizedTest
  void testThreeSum(int[] input, List<List<Integer>> expected) {
    assertThat(threeSumUnderTest.threeSum(input)).isEqualTo(expected);
  }

  private static Stream<Arguments> testThreeSum() {
    return Stream.of(
        Arguments.arguments(
            new int[] {-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, 0, 1), List.of(-1, -1, 2))),
//        Arguments.arguments(new int[] {-1, 0, 1}, List.of(List.of(-1, 0, 1))),
//        Arguments.arguments(new int[] {0, 1, 1}, List.of()),
        Arguments.arguments(new int[] {0, 0, 0}, List.of(List.of(0, 0, 0))));
  }
}
