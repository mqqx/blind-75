package dev.hmmr.challenge.blind75.linkedlist;

import dev.hmmr.challenge.blind75.linkedlist.LC0206.ListNode;

public class LC0143 {
  /**
   * Definition for singly-linked list.
   */

  static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }

    // Step 1: Find the middle of the linked list
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Step 2: Reverse the second half of the list
    ListNode secondHalf = reverseListIteratively(slow.next);
    slow.next = null;  // Break the list into two halves

    // Step 3: Merge the two halves
    mergeLists(head, secondHalf);
  }

  private ListNode reverseListIteratively(ListNode head) {
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

  private void mergeLists(ListNode l1, ListNode l2) {
    while (l1 != null && l2 != null) {
      ListNode l1Next = l1.next;
      ListNode l2Next = l2.next;

      l1.next = l2;
      if (l1Next == null) {
        break;
      }
      l2.next = l1Next;

      l1 = l1Next;
      l2 = l2Next;
    }
  }
}
