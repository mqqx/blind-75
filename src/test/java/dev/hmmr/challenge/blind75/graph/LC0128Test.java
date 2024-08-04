package dev.hmmr.challenge.blind75.graph;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0128Test {

  private LC0128 LC0128UnderTest;

  @BeforeEach
  void setUp() {
    LC0128UnderTest = new LC0128();
  }

  @MethodSource
  @ParameterizedTest
  void testLongestConsecutive(int[] nums, int expected) {
    assertThat(LC0128UnderTest.longestConsecutive(nums)).isEqualTo(expected);
  }

  static Stream<Arguments> testLongestConsecutive() {
    return Stream.of(
        arguments(new int[] {100, 4, 200, 1, 3, 2}, 4),
        arguments(new int[] {0}, 1),
        arguments(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9));
  }
}
