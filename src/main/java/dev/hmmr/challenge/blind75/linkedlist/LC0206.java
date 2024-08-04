package dev.hmmr.challenge.blind75.linkedlist;

public class LC0206 {
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

  ListNode reverseListIteratively(ListNode head) {
    // will be the new head of the reversed list
    ListNode last = null;
    // current node which will be processed
    ListNode cur = head;

    while (cur != null) {
      // store the next node
      ListNode next = cur.next;
      // reverse the link
      cur.next = last;
      // move last one step forward
      last = cur;
      // move current to the next node
      cur = next;
    }
    return last;
  }

  // recursively
  ListNode reverseList(ListNode head) {
    // if the list is empty or has only one node, it's already reversed
    if (head == null || head.next == null) {
      return head;
    }

    // recursively reverse the rest of the list
    ListNode result = reverseList(head.next);
    // point the node after head back to head
    head.next.next = head;
    // set head's next to null to avoid cycles and finish the reversal
    head.next = null;

    // return the new head of the reversed list
    return result;
  }
}
