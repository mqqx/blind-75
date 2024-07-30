package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class UniquePathsTest {

  private UniquePaths uniquePathsUnderTest;

  @BeforeEach
  void setUp() throws Exception {
    uniquePathsUnderTest = new UniquePaths();
  }

  @MethodSource
  @ParameterizedTest
  void testUniquePaths(int m, int n, int expected) {
    assertThat(uniquePathsUnderTest.uniquePaths(m, n)).isEqualTo(expected);
  }

  static Stream<Arguments> testUniquePaths() {
    return Stream.of(Arguments.arguments(3, 7, 28), Arguments.arguments(3, 2, 3));
  }
}
