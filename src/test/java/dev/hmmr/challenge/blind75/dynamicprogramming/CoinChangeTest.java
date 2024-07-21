package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CoinChangeTest {

  private CoinChange coinChangeUnderTest;

  @BeforeEach
  void setUp() {
    coinChangeUnderTest = new CoinChange();
  }

  @MethodSource
  @ParameterizedTest
  void testCoinChange(int[] coins, int amount, int expected) {
    assertThat(coinChangeUnderTest.coinChange(coins, amount)).isEqualTo(expected);
  }

  static Stream<Arguments> testCoinChange() {
    return Stream.of(
        Arguments.arguments(new int[] {1, 2, 5}, 11, 3),
        Arguments.arguments(new int[] {2}, 3, -1),
        Arguments.arguments(new int[] {1}, 0, 0),
        Arguments.arguments(new int[] {186, 419, 83, 408}, 6249, 20));
  }
}
