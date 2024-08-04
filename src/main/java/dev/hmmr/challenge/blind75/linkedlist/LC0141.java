package dev.hmmr.challenge.blind75.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LC0141 {
  /** Definition for singly-linked list. */
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  // O(n) space
  boolean hasCycle(ListNode head) {
    // keep track of visited nodes to check for cyclic dependency
    final Set<ListNode> visited = new HashSet<>();

    while (head != null) {
      if (visited.contains(head)) {
        return true;
      }
      visited.add(head);
      head = head.next;
    }

    return false;
  }

  // O(1) space
  // use floyd's tortoise and hare algorithm
  // if there is a cycle tortoise and hare will eventually meet at the same node
  boolean hasCycleO1(ListNode head) {
    ListNode tortoise = head;
    ListNode hare = head;

    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;

      if (tortoise == hare) {
        return true;
      }
    }

    return false;
  }
}
