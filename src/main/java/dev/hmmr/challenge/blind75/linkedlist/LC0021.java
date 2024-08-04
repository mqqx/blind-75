package dev.hmmr.challenge.blind75.linkedlist;

public class LC0021 {

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

  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // node used to merge list 1 and list 2 into
    ListNode mergeNode = new ListNode();
    ListNode cur = mergeNode;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        cur.next = list1;
        list1 = list1.next;
      } else {
        cur.next = list2;
        list2 = list2.next;
      }
      cur = cur.next;
    }

    cur.next = list1 == null ? list2 : list1;
    // use next node to ignore initial merge node in response
    return mergeNode.next;
  }
}
