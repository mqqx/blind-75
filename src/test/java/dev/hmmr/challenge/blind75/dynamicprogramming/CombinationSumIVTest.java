package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CombinationSumIVTest {

  private CombinationSumIV combinationSumIVUnderTest;

  @BeforeEach
  void setUp() {
    combinationSumIVUnderTest = new CombinationSumIV();
  }

  @MethodSource
  @ParameterizedTest
  void testCombinationSum4(int[] nums, int target, int expected) {
    assertThat(combinationSumIVUnderTest.combinationSum4(nums, target)).isEqualTo(expected);
  }

  static Stream<Arguments> testCombinationSum4() {
    return Stream.of(
        // The possible combination ways are:
        //    (1, 1, 1, 1)
        //    (1, 1, 2)
        //    (1, 2, 1)
        //    (1, 3)
        //    (2, 1, 1)
        //    (2, 2)
        //    (3, 1)
        Arguments.arguments(new int[] {1, 2, 3}, 4, 7),
        // The possible combination ways are:
        //    (2, 2, 2, 2)
        //    (2, 2, 4)
        //    (2, 4, 2)
        //    (4, 2, 2)
        //    (4, 4)
        //    (8)
        Arguments.arguments(new int[] {2, 4, 8}, 8, 6),
        Arguments.arguments(new int[] {9}, 3, 0));
  }
}
