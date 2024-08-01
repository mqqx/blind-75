package dev.hmmr.challenge.blind75.graph;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CourseScheduleTest {

  private CourseSchedule courseScheduleUnderTest;

  @BeforeEach
  void setUp() {
    courseScheduleUnderTest = new CourseSchedule();
  }

  @MethodSource
  @ParameterizedTest
  void testCanFinish(int numCourses, int[][] prerequisites, boolean expected) {
    assertThat(courseScheduleUnderTest.canFinish(numCourses, prerequisites)).isEqualTo(expected);
  }

  static Stream<Arguments> testCanFinish() {
    return Stream.of(
        Arguments.arguments(2, new int[][] {{1, 0}}, true),
        Arguments.arguments(2, new int[][] {{1, 0}, {0, 1}}, false),
        Arguments.arguments(3, new int[][] {{1, 0}, {0, 2}, {2, 1}}, false),
        Arguments.arguments(
            20,
            new int[][] {{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}},
            false));
  }
}
