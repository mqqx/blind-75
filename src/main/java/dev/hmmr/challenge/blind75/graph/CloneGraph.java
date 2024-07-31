package dev.hmmr.challenge.blind75.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
  public int val;
  public List<Node> neighbors;

  public Node() {
    val = 0;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val) {
    val = _val;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val, ArrayList<Node> _neighbors) {
    val = _val;
    neighbors = _neighbors;
  }
}

public class CloneGraph {
  // HashMap to keep track of cloned nodes
  private HashMap<Integer, Node> cloneMap = new HashMap<>();

  private Node clone(Node node) {
    // if the node is already cloned, return the cloned node
    if (cloneMap.containsKey(node.val)) {
      return cloneMap.get(node.val);
    }

    // create a new node with the same value
    Node clonedNode = new Node(node.val);

    // add the new node to the cloneMap
    cloneMap.put(node.val, clonedNode);

    // recursively clone all neighbors
    for (Node neighbor : node.neighbors) {
      clonedNode.neighbors.add(clone(neighbor));
    }

    // return the cloned node
    return clonedNode;
  }

  public Node cloneGraph(Node node) {
    // cover null case
    if (node == null) {
      return null;
    }

    return clone(node);
  }
}
