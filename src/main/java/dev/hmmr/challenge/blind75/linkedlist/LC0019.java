package dev.hmmr.challenge.blind75.linkedlist;

public class LC0019 {
  /** Definition for singly-linked list. */
  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast = head;
    ListNode slow = head;

    // move fast pointer n nodes ahead
    for (int i = 0; i < n; i++) {
      fast = fast.next;
    }

    // if fast is null, it means that the head needs to be removed
    if (fast == null) {
      return head.next;
    }

    // move both pointers until fast reaches the end
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }

    // remove the nth node from the end
    slow.next = slow.next.next;
    return head;
  }
}
