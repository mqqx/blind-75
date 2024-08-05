package dev.hmmr.challenge.blind75.linkedlist;

import dev.hmmr.challenge.blind75.linkedlist.LC0021.ListNode;

public class LC0023 {

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

  // merge lists one-by-one
  ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    } else if (lists.length == 1) {
      return lists[0];
    }

    ListNode cur = lists[0];

    for (int i = 1; i < lists.length; i++) {
      cur = mergeTwoLists(cur, lists[i]);
    }

    return cur;
  }

  ListNode mergeDivideAndConquer(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }
    return divideAndConquer(lists, 0, lists.length - 1);
  }

  // merge lists with divide and conquer
  private ListNode divideAndConquer(ListNode[] lists, int lo, int hi) {
    // if low index is greater than high index, return null
    // this happens when we've divided beyond valid list indices
    if (lo > hi) {
      return null;
    }

    // if low index equals high index, we have a single list return this list as is
    if (lo == hi) {
      return lists[lo];
    }

    // calculate the middle index to divide the problem
    int mid = lo + (hi - lo) / 2;
    // recursively divide and conquer the left half of the lists
    ListNode left = divideAndConquer(lists, lo, mid);
    // recursively divide and conquer the right half of the lists
    ListNode right = divideAndConquer(lists, mid + 1, hi);
    return mergeTwoLists(left, right);
  }

  private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
