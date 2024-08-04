package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LC0062Test {

  private LC0062 LC0062UnderTest;

  @BeforeEach
  void setUp() throws Exception {
    LC0062UnderTest = new LC0062();
  }

  @MethodSource
  @ParameterizedTest
  void testUniquePaths(int m, int n, int expected) {
    assertThat(LC0062UnderTest.uniquePaths(m, n)).isEqualTo(expected);
  }

  static Stream<Arguments> testUniquePaths() {
    return Stream.of(Arguments.arguments(3, 7, 28), Arguments.arguments(3, 2, 3));
  }
}
