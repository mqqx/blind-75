package dev.hmmr.challenge.blind75.graph;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NodeTest {

  @MethodSource
  @ParameterizedTest
  void testCloneGraph(Node input, Node expected) {
    assertThat(new CloneGraph().cloneGraph(input)).usingRecursiveComparison().isEqualTo(expected);
  }

  static Stream<Arguments> testCloneGraph() {
    final Node node1 = new Node(1);
    final Node node2 = new Node(2);
    final Node node3 = new Node(3);
    final Node node4 = new Node(4);

    node1.neighbors = List.of(node2, node4);
    node2.neighbors = List.of(node1, node3);
    node3.neighbors = List.of(node2, node4);
    node4.neighbors = List.of(node1, node3);

    final Node expectedNode1 = new Node(1);
    final Node expectedNode2 = new Node(2);
    final Node expectedNode3 = new Node(3);
    final Node expectedNode4 = new Node(4);

    expectedNode1.neighbors = List.of(expectedNode2, expectedNode4);
    expectedNode2.neighbors = List.of(expectedNode1, expectedNode3);
    expectedNode3.neighbors = List.of(expectedNode2, expectedNode4);
    expectedNode4.neighbors = List.of(expectedNode1, expectedNode3);

    return Stream.of(
        Arguments.arguments(node1, expectedNode1),
        Arguments.arguments(new Node(1), new Node(1)),
        Arguments.arguments(new Node(), new Node()),
        Arguments.arguments(null, null));
  }
}
