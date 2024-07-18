package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInRotatedSortedArrayTest {

  private SearchInRotatedSortedArray searchInRotatedSortedArrayUnderTest;

  @BeforeEach
  void setUp() {
    searchInRotatedSortedArrayUnderTest = new SearchInRotatedSortedArray();
  }

  @MethodSource
  @ParameterizedTest
  void testSearch(int[] input, int target, int expected) {
    assertThat(searchInRotatedSortedArrayUnderTest.search(input, target)).isEqualTo(expected);
  }

  private static Stream<Arguments> testSearch() {
    return Stream.of(
        Arguments.arguments(new int[] {4,5,6,7,0,1,2}, 0, 4),
        Arguments.arguments(new int[] {4,5,6,7,0,1,2}, 3, -1),
        Arguments.arguments(new int[] {1}, 0, -1));
  }
}
