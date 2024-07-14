package dev.hmmr.challenge.blind75.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainsDuplicateTest {

  private ContainsDuplicate containsDuplicateUnderTest;

  @BeforeEach
  void setUp() {
    containsDuplicateUnderTest = new ContainsDuplicate();
  }

  @MethodSource
  @ParameterizedTest
  void testContainsDuplicate(int[] input, boolean expected) {
    assertThat(containsDuplicateUnderTest.containsDuplicateHash(input)).isEqualTo(expected);
    assertThat(containsDuplicateUnderTest.containsDuplicateStream(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testContainsDuplicate() {
    return Stream.of(
        Arguments.arguments(new int[] {1, 2, 3, 1}, true),
        Arguments.arguments(new int[] {1, 2, 3, 4}, false),
        Arguments.arguments(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true));
  }
}
