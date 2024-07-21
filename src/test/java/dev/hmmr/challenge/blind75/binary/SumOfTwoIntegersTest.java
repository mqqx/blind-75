package dev.hmmr.challenge.blind75.binary;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumOfTwoIntegersTest {

  private SumOfTwoIntegers sumOfTwoIntegersUnderTest;

  @BeforeEach
  void setUp() {
    sumOfTwoIntegersUnderTest = new SumOfTwoIntegers();
  }

  @MethodSource
  @ParameterizedTest
  void testGetSum(int a, int b, int expected) {
    assertThat(sumOfTwoIntegersUnderTest.getSum(a, b)).isEqualTo(expected);
  }

  static Stream<Arguments> testGetSum() {
    return Stream.of(Arguments.arguments(999, 999, 1998), Arguments.arguments(2, 3, 5));
  }
}
