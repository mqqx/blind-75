package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ClimbingStairsTest {

  private ClimbingStairs climbingStairsUnderTest;

  @BeforeEach
  void setUp() {
    climbingStairsUnderTest = new ClimbingStairs();
  }

  @MethodSource
  @ParameterizedTest
  void testClimbStairs(int input, int expected) {
    assertThat(climbingStairsUnderTest.climbStairs(input)).isEqualTo(expected);
  }

  static Stream<Arguments> testClimbStairs() {
    return Stream.of(
        // 1
        Arguments.arguments(1, 1),
        // 11, 2
        Arguments.arguments(2, 2),
        // 111, 12, 21
        Arguments.arguments(3, 3),
        // 1111, 112, 211, 22, 121
        Arguments.arguments(4, 5),
        // 11111, 1112, 1121, 1211, 2111, 221, 212, 122
        Arguments.arguments(5, 8));
  }
}
