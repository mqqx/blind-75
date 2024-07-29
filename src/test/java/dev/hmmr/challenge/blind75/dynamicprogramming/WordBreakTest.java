package dev.hmmr.challenge.blind75.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordBreakTest {

  private WordBreak wordBreakUnderTest;

  @BeforeEach
  void setUp() {
    wordBreakUnderTest = new WordBreak();
  }

  @MethodSource
  @ParameterizedTest
  void testWordBreak(String s, List<String> words, boolean expected) {
    assertThat(wordBreakUnderTest.wordBreak(s, words)).isEqualTo(expected);
  }

  static Stream<Arguments> testWordBreak() {
    return Stream.of(
        Arguments.arguments("leetcode", List.of("leet", "code"), true),
        Arguments.arguments("applepenapple", List.of("apple", "pen"), true),
        Arguments.arguments("cars", List.of("car", "ca", "rs"), true),
        Arguments.arguments("cbca", List.of("bc", "ca"), false),
        Arguments.arguments("catsandog", List.of("cats", "dog", "sand", "and", "cat"), false));
  }
}
