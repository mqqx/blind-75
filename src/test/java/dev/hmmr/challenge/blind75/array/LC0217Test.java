package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0217Test {

  private LC0217 LC0217UnderTest;

  @BeforeEach
  void setUp() {
    LC0217UnderTest = new LC0217();
  }

  @MethodSource
  @ParameterizedTest
  void testContainsDuplicate(int[] input, boolean expected) {
    assertThat(LC0217UnderTest.containsDuplicateHash(input)).isEqualTo(expected);
    assertThat(LC0217UnderTest.containsDuplicateStream(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testContainsDuplicate() {
    return Stream.of(
        Arguments.arguments(new int[] {1, 2, 3, 1}, true),
        Arguments.arguments(new int[] {1, 2, 3, 4}, false),
        Arguments.arguments(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true));
  }
}
