package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HouseRobberTest {
  private HouseRobber houseRobberUnderTest;

  @BeforeEach
  void setUp() {
    houseRobberUnderTest = new HouseRobber();
  }

  @MethodSource
  @ParameterizedTest
  void testRob(int[] nums, int expected) {
    assertThat(houseRobberUnderTest.rob(nums)).isEqualTo(expected);
  }

  static Stream<Arguments> testRob() {
    return Stream.of(
        Arguments.arguments(new int[] {1, 2, 3, 1}, 4),
        Arguments.arguments(new int[] {0}, 0),
        Arguments.arguments(new int[] {0, 0}, 0),
        Arguments.arguments(new int[] {1, 3, 1}, 3),
        Arguments.arguments(new int[] {8, 2, 2, 8}, 16),
        Arguments.arguments(new int[] {8, 2, 2, 2, 2, 8}, 18),
        Arguments.arguments(new int[] {2, 7, 9, 3, 1}, 12));
  }
}
