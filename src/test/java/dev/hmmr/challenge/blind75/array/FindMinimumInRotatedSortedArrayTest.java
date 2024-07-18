package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindMinimumInRotatedSortedArrayTest {

  private FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArrayUnderTest;

  @BeforeEach
  void setUp() {
    findMinimumInRotatedSortedArrayUnderTest = new FindMinimumInRotatedSortedArray();
  }

  @MethodSource
  @ParameterizedTest
  void testFindMin(int[] input, int expected) {
    assertThat(findMinimumInRotatedSortedArrayUnderTest.findMinStream(input)).isEqualTo(expected);
    assertThat(findMinimumInRotatedSortedArrayUnderTest.findMinBinarySearch(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testFindMin() {
    return Stream.of(
        Arguments.arguments(new int[] {3, 4, 5, 1, 2}, 1),
        Arguments.arguments(new int[] {4, 5, 6, 7, 0, 1, 2}, 0),
        Arguments.arguments(new int[] {11, 13, 15, 17}, 11));
  }
}
