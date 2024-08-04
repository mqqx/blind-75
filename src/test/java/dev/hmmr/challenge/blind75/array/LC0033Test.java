package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0033Test {

  private LC0033 LC0033UnderTest;

  @BeforeEach
  void setUp() {
    LC0033UnderTest = new LC0033();
  }

  @MethodSource
  @ParameterizedTest
  void testSearch(int[] input, int target, int expected) {
    assertThat(LC0033UnderTest.search(input, target)).isEqualTo(expected);
  }

  private static Stream<Arguments> testSearch() {
    return Stream.of(
        Arguments.arguments(new int[] {4,5,6,7,0,1,2}, 0, 4),
        Arguments.arguments(new int[] {4,5,6,7,0,1,2}, 3, -1),
        Arguments.arguments(new int[] {1}, 0, -1));
  }
}
